import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { DireccionService } from './services/direcciones/direccion.service';
import { KeywordService } from './services/keywords/keyword.service';
import { TituloService } from './services/titulos/titulo.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'FrontEnd';

  constructor(
    public fb: FormBuilder,
  ){

  }

  ngOnInit(): void {
    
  }
}
