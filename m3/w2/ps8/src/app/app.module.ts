import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing/app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { TodoComponent } from './components/todo/todo.component';
import { CompletedComponent } from './components/completed/completed.component';
import { RouterModule } from '@angular/router';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    TodoComponent,
    CompletedComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule


  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
