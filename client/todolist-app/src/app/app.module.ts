import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http'; 

import { AppComponent } from './app.component';
import { TodoListComponent } from './todo-list/todo-list.component';

import { TodoServiceService } from './services/todo-service.service';

import { TaskFilter }from './utils/task-filter';

@NgModule({
  declarations: [
    AppComponent,
    TodoListComponent,
    TaskFilter
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [
    TodoServiceService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { 

}
