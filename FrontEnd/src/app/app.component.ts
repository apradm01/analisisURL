import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { DireccionService } from './services/direcciones/direccion.service';
import { KeywordService } from './services/keywords/keyword.service';
import { TituloService } from './services/titulos/titulo.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{

  direccionForm!: FormGroup;

  constructor(
    public fb: FormBuilder,
    public direccionService: DireccionService,
    public keywordService: KeywordService,
    public tituloService: TituloService
  ){

  }

  ngOnInit(): void {
    this.direccionForm = this.fb.group({
      url: ['', Validators.required],
    })
  }

  guardar():void{

  }

}
