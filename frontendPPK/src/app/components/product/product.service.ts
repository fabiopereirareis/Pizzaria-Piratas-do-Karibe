import { Observable } from 'rxjs';
import { Product } from './product.model';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  baseUrl = "https://backend-ppk.herokuapp.com/api/contact/"
  readList = "https://backend-ppk.herokuapp.com/api/contact/list" // também funciona

  constructor(private snackBar: MatSnackBar, private http: HttpClient) { }

  showMessage(msg: string): void {
    this.snackBar.open(msg, 'X', {
      duration: 3000,
      horizontalPosition: "right",
      verticalPosition: "top"
    })
  }


  create(product: Product): Observable<Product> {
    return this.http.post<Product>(this.baseUrl, product)
  }

  read(): Observable<Product[]> {
    return this.http.get<Product[]>(this.baseUrl + "list")
  }

  readById(id: string | null): Observable<Product> {
    const url = `${this.baseUrl}/${id}`
    return this.http.get<Product>(url)
  }

  update(product: Product): Observable<Product> {
    const url = `${this.baseUrl}/update/${product.id}`
    return this.http.put<Product>(url, product)
  }
  // método que eu fiz sozinho
  delete(product: Product): Observable<Product> {
    const url = `${this.baseUrl}/delete/${product.id}`
    return this.http.delete<Product>(url);
  }

  // método aprendido em aula
  delete2(id: string): Observable<Product> {
    const url = `${this.baseUrl}/delete/${id}`
    return this.http.delete<Product>(url);
  }

}
