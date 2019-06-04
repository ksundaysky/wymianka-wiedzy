import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent {

  title = 'todoList';
  newTask: string;
  listOfTasks = [];
  listOfDone: Array<string> = [];
  isPressed = false;

  addTask() {
    this.listOfTasks.push(this.newTask);
    this.newTask = '';
  }

  delete(task) {
    this.listOfTasks = this.listOfTasks.filter(e => e !== task );
  }

  done(task: string){
    this.listOfDone.push(task);
    this.delete(task);
  }
}
