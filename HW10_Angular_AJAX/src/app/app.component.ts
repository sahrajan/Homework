// Example 9
import { Component } from '@angular/core';
@Component({
    selector:     'app-root',
    templateUrl:  './app.component.html',
    styleUrls:   ['./app.component.css']
})
export class AppComponent {
    title = 'app';
}


// Example 8
// import { Component } from '@angular/core';
// @Component({
//   selector: 'app-root',
//   templateUrl: './app.component.html',
//   styleUrls: ['./app.component.css']
// })
// export class AppComponent {
//   title = 'app';
//   myMouseHandler(event: any, description: string) {
//     console.log(description + " X: ")
// } }




// // Example 7
// import { Component } from '@angular/core';
// @Component({
//   selector: 'app-root',
//   templateUrl: './app.component.html',
//   styleUrls: ['./app.component.css']
// })
// export class AppComponent {
//   title = 'app';
//   cutContent = '';
  
//   cutEvent(content: string) {
//     this.cutContent = content;
//     console.log(content)
//   }
//   pasteContent() {
//     console.log(this.cutContent);
//     this.cutContent = '';
//   }
// }



//  Example 6 Focus Event Handling 
// import { Component } from '@angular/core';
// @Component({

//   selector: 'app-root',
//   templateUrl: './app.component.html',
//   styleUrls: ['./app.component.css']
// })
// export class AppComponent {
//   title = 'app';
//   myFocusEvent(description: any) {
//     console.log(description)
// } }






// Example 5
// import { Component } from '@angular/core';
// @Component({
//   selector: 'app-root',
//   templateUrl: './app.component.html',
//   styleUrls: [ './app.component.css']
// })
// export class AppComponent {
//   title = 'app';
//   myKeyDown(event: { key: any; }) {
//     console.log(event)
//     console.log(event.key)
// } }




// Example 4
// import { Component } from '@angular/core';
// @Component({
//   selector: 'app-root',
//   templateUrl: './app.component.html',
//   styleUrls:  ['./app.component.css']
// })
// export class AppComponent {
//   title = 'app';
  
//   myMouseEnter() {
//     console.log("Mouse entered!")
    
// } }



// Exercise 3
// import { Component } from '@angular/core';
// // This component consumes the re-usable service. 
// @Component({
// selector: 'app-root',
// template: `
// <h3>Please enter the customer informatino:</h3>
// <child [callParent]="parentFuncRef" ></child> {{dataFromChild}}
// `
// })
// export class AppComponent {
// parentFuncRef!: Function; 
// operations!: Array<any>; 
// dataFromChild!: string;
// // This function is called by the Angular framework after // the constructor executes.
// public ngOnInit() {
// this.parentFuncRef = this.myCallBackFunction.bind(this); }
// // This function can be called by child.
// public myCallBackFunction(streetAddress: any, city: any, region: any) {
// this.dataFromChild =
// "Street Address: " + streetAddress + " " + "Region: " + region+ " "+ "City: " + city;
// } }




//Example 3
// import { Component } from '@angular/core';

// // This component consumes the re-usable service.
// @Component({
//   selector: 'app-root',
//   template: `
//   <h3>Please enter the customer informatino:</h3>
//   <child [callParent]="parentFuncRef"></child>
//   {{dataFromChild}}`
// })

// export class AppComponent {
//   parentFuncRef!: Function;
//   operations!:    Array<any>;
//   dataFromChild!: string;
//   // This function is called by the Angular framework after
//   // the constructor executes.
//   public ngOnInit() {
//     this.parentFuncRef = this.myCallBackFunction.bind(this);
//   }
//   // This function can be called by child.
//   public myCallBackFunction(streetAddress: any, city: any) 
//   {
//     this.dataFromChild = "Street Address: " + streetAddress + " " + "City: " + city;
//    } }




// Example 2
// import { Component } from '@angular/core';
// import { HttpClient } from '@angular/common/http';
// @Component({
//     selector: 'app-root',
//     template: `<button (click)="getSomeData()">Test GET Request</button>
//                 <ul>
//                     <li *ngFor="let myData of namesArray">{{myData.first}}
//                     {{myData.last}}</li>
// </ul>`
// })
// export class AppComponent {
//     namesArray!: Array<any>;
//     _http:HttpClient;
//     // Since we are using a provider above we can receive
//     // an instance through an instructor.
//     constructor(private http: HttpClient) {
//         this._http = http;
//     }
//     getSomeData() {
//       this._http.get<any>('./assets/test.json')
//           // Get data and wait for result.
//           .subscribe(result => {
//             this.namesArray = result;
// },
//           error =>{
//             // Let user know about the error.
//             alert(error);
//             console.error(error)
// }) }
// }