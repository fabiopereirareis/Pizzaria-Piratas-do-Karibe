import { ProductService } from './../product.service';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Product } from '../product.model';

@Component({
  selector: 'app-product-create',
  templateUrl: './product-create.component.html',
  styleUrls: ['./product-create.component.css']
})
export class ProductCreateComponent implements OnInit {

  product: Product = {
    number: 21212121,
    type: "teste 001"
  }

  constructor(private productService: ProductService, private router: Router) { }

  ngOnInit(): void {

  }
  createProduct(): void {
    this.productService.create(this.product).subscribe(() => {
      console.log(this.product)
      this.productService.showMessage('Operação executada com sucesso')
      this.router.navigate(['/products']);
    })
  }
  cancel(): void {
    this.router.navigate(['/products']);
  }

}
