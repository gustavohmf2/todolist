import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Task } from '../models/task';

@Injectable({
  providedIn: 'root'
})
export class TodoServiceService {

  private url:string = 'http://localhost:8080/task/';

  constructor(private _http:HttpClient) { }

  list(){

    return this._http.get(this.url);
  }

  delete(task:Task) {
    console.log(task);

    let hparams = new HttpParams();
    hparams.append('taskid', JSON.stringify(task.id));

    return this._http.get(this.url+'delete?taskid='+task.id);
  }

  save(task:Task) {

    return this._http.post(this.url, task);
  }

  update(task:Task) {
    return this._http.post(this.url, task);
  }
}
