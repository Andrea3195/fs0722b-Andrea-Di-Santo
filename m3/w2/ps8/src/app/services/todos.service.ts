import { Injectable } from '@angular/core';
import { Todo } from '../models/todo';

@Injectable({
  providedIn: 'root'
})
export class TodosService {

  todo : Todo[] =[];

  filterTodo(id: number) {
    console.log(this.todo)
    return this.todo.filter(t => t.id === id)
    }
  constructor() { }

  toggle(id:number) {
    this.todo.map((t)=>{
      if (t.id === id) t.completed = !t.completed
      return console.log(t)
    })

  }

};





