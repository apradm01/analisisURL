import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class DireccionService {

  private API_SERVER = "http://localhost:8080/direccion/";

  constructor(
    private httpClient: HttpClient
  ) { }

  public getAllDirecciones(): Observable<any>{
    return this.httpClient.get(this.API_SERVER);
  }

  public saveDireccion (direccion:any): Observable<any>{
    return this.httpClient.post(this.API_SERVER,direccion);
  }
}
