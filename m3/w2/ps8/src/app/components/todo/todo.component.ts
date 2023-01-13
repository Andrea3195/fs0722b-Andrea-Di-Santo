import { Component, Input, OnInit } from '@angular/core';
import { Todo } from 'src/app/models/todo';
import { TodosService } from 'src/app/services/todos.service';

@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.scss']
})
export class TodoComponent implements OnInit {

  todo: Todo[] = []
  async addTask(Todo: any) {
    return setTimeout(() =>{

         this.todo.push({id:this.todo.length,title:Todo,completed:false})
      Todo = ''

      }, 2000)
  }


    getPostById(id:number){

      return this.todo.find((t)=>{

       console.log (t.id)
      })}
    disattiva(id:number) {
        console.log(id);
        this.todo = this.todo.filter(t=>t.id!=id)
        this.tSrv.toggle(id);
      }



  constructor(private tSrv:TodosService) {

  }




  ngOnInit(): void {

  }




}
