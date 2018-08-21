import { Component, OnInit } from '@angular/core';
import { TodoServiceService } from '../services/todo-service.service';
import { Task } from '../models/task';


@Component({
  selector: 'app-todo-list',
  templateUrl: './todo-list.component.html',
  styleUrls: ['./todo-list.component.css']
})
export class TodoListComponent implements OnInit {

  private _taskList:Task[]; 
  private _defaultList:Task[];

  constructor(private _taskService:TodoServiceService) { 

   
    
/*
    this._taskList = [
        new Task(1,"teste 1", true),
        new Task(2,"teste 2", false),
        new Task(3,"teste 3", false),
        new Task(4,"teste 4", true)
    ];
    //console.log(this._taskList);
    console.log("task 1");
    console.log(this._taskList);

    this._defaultList = this._taskList;
    */
  }

  ngOnInit() {

    console.log("task");
    this._taskService.list().subscribe((data) =>{
      console.log(data);
      this._taskList = data['data'];
      this._defaultList = this._taskList;
    },(erro) => {
        console.log(erro);
    });
    /*
    this._taskService.list().subscribe((data) =>{

      this._taskList = data['task'];
    },(erro) => {
        console.log(erro);
    });
    */
  }

  newTask(title) {

    console.log(title);
    /*
    
    this._taskList.push(ntask);
    this._defaultList = this._taskList;
      */
    
    let ntask = new Task(null,title,false);
    
    this._taskService.save(ntask).subscribe((data) => {

      this._taskList.push(ntask);
      this._defaultList = this._taskList;

    }, (error) =>{
        console.log(error);
    })
  
  }

  remove(task, i) {
 /*
    this._taskList.splice(i,1);
    this._defaultList.splice(i,1);
   */
  console.log(task);
    this._taskService.delete(task).subscribe(() => {

        this._taskList.splice(i,1);
        this._defaultList.splice(i,1);

    }, (erro)=> {
      console.log(erro);
    });
    
  }

  update(task) {

    task.completed = true;
    this._taskService.save(task).subscribe((data) => {

      this._taskService.list().subscribe((data) =>{
        console.log(data);
        this._taskList = data['data'];
        this._defaultList = this._taskList;
      },(erro) => {
          console.log(erro);
      });
      

    }, (error) =>{
        console.log(error);
    })
  
  }

  removeAllCompleted() {

    this._taskList.forEach((value,index) => {
      if(value.completed){
        this._taskService.delete(value).subscribe((data) => {
            console.log('success');
            this._defaultList.splice(index,1);
        }, (error) => {
          console.log(error);
        })
      }
    });

    this._taskList =  this._defaultList;
  }

  orderDefault() {
    this._taskList = this._defaultList;

  }

  orderByCompleted() {

    /*
    this._taskList = this._taskList.map((task) => {
      if(task.completed){
        console.log(task);
        return task;
      }
    });
*/
    this._taskList = this._defaultList.filter(item => {

      return item.completed? item : null; 
    });
   
  }

  orderByActive() {
    /*
    this._taskList = this._taskList.map((task) => {
      if(!task.completed){
        return task;
      }
    });
    */
   
   this._taskList =  this._defaultList.filter(item => {

      return item.completed? null : item; 
    });
   
  }

  get taskList() {
    return this._taskList;
  }

}
