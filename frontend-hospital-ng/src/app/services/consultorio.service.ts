import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ConsultorioService {

  private baseUrl = 'http://localhost:8080/consultorios';

  constructor(private http: HttpClient) { }

  getConsultorios(): Observable<any[]> {
    return this.http.get<any[]>(this.baseUrl);
  }

  getConsultorio(id: number): Observable<any> {
    return this.http.get<any>(`${this.baseUrl}/${id}`);
  }

}
