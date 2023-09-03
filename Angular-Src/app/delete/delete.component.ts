import { Component, OnInit } from '@angular/core';
import { DemoService } from '../demo.service';

@Component({
  selector: 'app-delete',
  templateUrl: './delete.component.html',
  styleUrls: ['./delete.component.css']
})
export class DeleteComponent implements OnInit {

  constructor(private s1:DemoService)
   { }

  ngOnInit(): void {
  }
  deletedata(deleteform:any)
  {
     return this.s1.deletedata1(deleteform.value).subscribe();
  }

}
