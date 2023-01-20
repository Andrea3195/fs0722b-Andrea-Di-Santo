import { Component, OnInit } from '@angular/core';
import { Movies } from 'src/app/interface/movies.interface';
import { MoviesService } from 'src/app/service/movies.service';
import { Subscription} from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import database from '../../assets/db.json';
@Component({
  selector: 'app-popular',
  templateUrl: './popular.component.html',
  styleUrls: ['./popular.component.scss']
})
export class PopularComponent implements OnInit {


ngOnInit() {
}

}
