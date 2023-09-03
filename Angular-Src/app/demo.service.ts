import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DemoService 
{

  link1 = "http://localhost:9001/insertrecord";
  link2 = "http://localhost:9001/updaterecord";
  link3 = "http://localhost:9001/deleterecord";
  link4 = "http://localhost:9001/viewrecord";

  
  constructor(private h1: HttpClient)
   { }

   insertdata1(data:any)
   {
    return this.h1.post(this.link1,data);
   }
   updatedata1(data:any)
   {
    return this.h1.post(this.link2,data);
   }
   deletedata1(data:any)
   {
     return this.h1.post(this.link3,data);
   }

   viewdata1()
   {
    return this.h1.get(this.link4);
   }
}
