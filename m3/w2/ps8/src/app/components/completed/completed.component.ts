import { Component, OnInit } from '@angular/core';
import { Todo } from 'src/app/models/todo';
import { TodosService } from 'src/app/services/todos.service';
@Component({
  selector: 'app-completed',
  templateUrl: './completed.component.html',
  styleUrls: ['./completed.component.scss']
})
export class CompletedComponent implements OnInit {

  todo :Todo[] = []
  filterTodo(id: number) {
    console.log(this.todo)
    return this.todo.filter(t => t.id === id)
    }
  constructor(private tS:TodosService) { }
  attiva(id:number) {
    console.log(id);
    this.todo = this.todo.filter(p=>p.id!=id)
    this.tS.toggle(id);
  }


  ngOnInit(): void {
  }

}
