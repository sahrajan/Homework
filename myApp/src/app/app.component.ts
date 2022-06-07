// import { Component } from '@angular/core';

// // // ********* Example 11 *************
// @Component({
//   selector: 'app-root',
//   template:
//     `<h1>This is the header</h1>
//   <nav>
//   <a routerLink="/page-a" routerLinkActive="active">A</a> |
//   <a routerLink="/page-b" routerLinkActive="active">B</a>
//   </nav>
//   <!-- Where router should display a view -->
// `
// })
// export class AppComponent { }




// ********* Example 10 *************
import { Component } from '@angular/core';
@Component({
  selector: 'app-root',
  template:
    `<h1>This is the header</h1>
  <nav>
  <a routerLink="/page-a" routerLinkActive="active">A</a> |
  <a routerLink="/page-b/5/Rajan" routerLinkActive="active">B</a>
  </nav>
  <!-- Where router should display a view -->
  <router-outlet> </router-outlet>`
})
export class AppComponent { }



// ********* Example 8 & 9 *************
// import { Component } from '@angular/core';
// @Component({
//   selector: 'app-root',
//   template:
//     `<h1>This is the header</h1>
//   <nav>
//   <a routerLink="/page-a" routerLinkActive="active">A</a> |
//   <a routerLink="/page-b" routerLinkActive="active">B</a>
//   </nav>
//   <!-- Where router should display a view -->
//   <router-outlet> </router-outlet>`
// })
// export class AppComponent { }

// ********* Example 7 *************
// import { Component } from '@angular/core';
// import { FahrenheitPipe } from './app.fahrenheitPipe';
// @Component({
//     selector: 'app-root',
//     template: `<p>{{celsius | fahrenheitPipe }}</p>
// `,
// })
// export class AppComponent {
//     celsius: number;
//     constructor() {
//         this.celsius = 33;
//     }
// }




// ********* Example 6 *************
// import { Component } from '@angular/core';
// @Component({
//     selector: 'app-root',
//     template: `
//            {{price | currency:'USD':true}}<br/>
// `, })
// export class AppComponent {
//     price: number = 23.23333;
//     constructor() {
// } }



// ********* Example 5 *************
// import { Component } from '@angular/core';
// @Component({
// selector: 'app-root',
// template: `<!-- Sep 17, 2019 -->
//              {{ mydate | date }}<br>
// <!-- Sep 17, 2019 -->
// <p>{{ mydate | date: 'y MMMM d' }}<br>
// <!-- Sep 17, 2019 -->
// <p>{{ mydate | date: 'mediumDate' }}<br>
// <!-- Tuesday, Sep 17, 2019 -->
// <p>{{ mydate | date: 'fullDate' }}<br>
// <!-- 6:00 PM -->
// <p>{{ mydate | date: 'shortTime' }}<br>
// <!-- TUESDAY, Sep 17, 2019 -->
// <p>{{ mydate | date:'fullDate' | uppercase}}</p>
// <!-- Sep 17, 2019 6:00PM -->
// <p>{{ mydate | date:'MMMM d, y h:mma' }}</p> `
// })
// export class AppComponent {
// // Months start counting at 0.
// mydate = new Date(2019, 8, 17, 18, 0, 30); }



// Another Format
// import { Component } from '@angular/core'; @Component({
//   selector: 'app-root', template: `
//   <!-- Sep 17, 2019 6:00PM -->
//   <p>{{ mydate | date:'EEEE, MMMM d, y h:mma' }}</p> `
//   })
//   export class AppComponent {
//   // Months start counting at 0.
//   mydate = new Date(2019, 8, 17, 18, 0, 30);
//   }

// ********* Example 4 *************
// import { Component } from '@angular/core'; 
// import { MyDataService } from './myDataService';
// @Component({
//     selector: 'app-root',
//     template: `<h1>Hello world!  {{title}}</h1>
// <ul><li *ngFor="let name of names">{{name}}</li></ul>`, // 'providers' allows you to create and pass an instance
// // of the class to the constructor header.
// providers: [MyDataService]
// })
// export class AppComponent {
//     public title = 'This is Angular!';
//     names: Array<any>;
// // Create instance of 'MyDataService' right in the constructor // header.
// constructor(myDataService: MyDataService) {
//         // Use service to call getNames() method.
//         this.names = myDataService.getNames();
//     }
// }



// ********* Example 3 *************
// import { Component } from '@angular/core';
// @Component({
//     selector: 'app-root',
//     template: `<h1>Hello world!  {{title}}</h1>
//                <second-directive [firstName]="author"></second-directive>`
// })
// export class AppComponent {
//     public title = 'This is Angular!';
//     public author = "Joyce.";
// }


// ********* Example 2 *************
// import { Component } from '@angular/core';
// @Component({
//     selector: 'app-root',
//     template: `<h1>Hello world!  {{title}}</h1><second-directive></second-directive>`
// })
// export class AppComponent {
//   public title = 'This is Angular!';
// }



// ********* Example 1 *************