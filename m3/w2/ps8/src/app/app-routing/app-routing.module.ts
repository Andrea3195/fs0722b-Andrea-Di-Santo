import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { TodoComponent } from '../components/todo/todo.component';
import { CompletedComponent } from '../components/completed/completed.component';
import { RouterModule, Routes } from '@angular/router';
import { NavbarComponent } from '../components/navbar/navbar.component';


const routes: Routes = [
  {
    path:'',
    component: TodoComponent
  },
  {
    path:'completati',
    component: CompletedComponent
  }
];

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ]

})

export class AppRoutingModule {

 }
