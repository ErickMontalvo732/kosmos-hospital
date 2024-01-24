import { Component } from '@angular/core';
import { ConsultorioService } from '../services/consultorio.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {

  consultorios: any[] = [];
  imageUrl: string = 'assets/consultorio.jpg';
  constructor(private consultorioService: ConsultorioService) { }

  ngOnInit(): void {
    this.consultorioService.getConsultorios().subscribe(
      data => {
        this.consultorios = data;
        console.log('====================================');
        console.log(data);
        console.log('====================================');
      },
      error => {
        console.error('Error al obtener los consultorios:', error);
      }
    );
  }
}
