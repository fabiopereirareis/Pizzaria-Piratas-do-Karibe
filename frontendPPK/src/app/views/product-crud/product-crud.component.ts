import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router'; // classe router para ter acesso as rotas do sistema

@Component({
  selector: 'app-product-crud',
  templateUrl: './product-crud.component.html',
  styleUrls: ['./product-crud.component.css']
})
export class ProductCrudComponent implements OnInit {

  constructor(private router: Router) { } // injetando um objeto do tipo router para ser usado nesse componente

  ngOnInit(): void {
  }

  navigateToProductCreate(): void {
    this.router.navigate(['/products/create']) // rota sendo usada
  }

}
