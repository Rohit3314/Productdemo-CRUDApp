import { Component, OnInit } from '@angular/core';
import { DemoService } from '../demo.service';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {

  constructor(private s1:DemoService) 
  { }

  ngOnInit(): void {
  }
  updatedata(updateform:any)
  {
    return this.s1.updatedata1(updateform.value).subscribe();
  }

}
