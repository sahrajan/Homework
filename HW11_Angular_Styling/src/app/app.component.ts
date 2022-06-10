//Exercise 3 
import { Component } from '@angular/core';
@Component({
selector: 'app-root',
template: `<p [ngStyle]="myStyle">style binding example</p>`,
})
export class AppComponent {
myStyle = { 'font-weight':'bold', 'color':'blue'
} }



// Example 5 Applying the [style directive]
// import { Component } from '@angular/core';
// @Component({
// selector: 'app-root',
// template: `<p [style.font-weight]="myWeight">style binding example</p>`,
// })
// export class AppComponent {
//   myWeight = "bold";
// }




// Example 4 Style Binding Multiple Style with [ngStyle]
// import { Component } from '@angular/core';
// @Component({
//   selector: 'app-root',
//   template: `<p [ngStyle]="myStyles">stye binding example</p>`,
// })
// export class AppComponent {
//   myStyles = {
//     'color':'red',
//     'font-weight':'bold'
// } }




// Example 3 Adding CSS
// import { Component } from '@angular/core';
// @Component({
//   selector: 'app-root',
//   template: `
//   <input type="checkbox" [(ngModel)]="doesNotExercise" (change)="adjustCSS()"/>
//   Does not exercise.
//   <input type="checkbox" [(ngModel)]="over55" (change)="adjustCSS()"/> 
//   Is over 55.
//   <div *ngIf="doesNotExercise || over55" [ngClass]="myClasses" >
//      Is at risk of heart disease.</div>
// `,
// styles: [` 
// .warning {
// font-weight:bold; 
// }

// .danger { 
//   color:red;
// }
// ` ]
// })

// export class AppComponent {
// title = 'app'; 
// doesNotExercise = false; 
// over55 = false;

// myClasses = { 
//   warning: true, 
//   danger: true
// }
// adjustCSS() {
// } }



// Example 3 Modify
// import { Component } from '@angular/core';
// @Component({
//   selector: 'app-root',
//   template: `
//   <input type="checkbox" [(ngModel)]="doesNotExercise" (change)="adjustCSS()"/>
// Does not exercise.
// <input type="checkbox" [(ngModel)]="over55" (change)="adjustCSS()"/> 
// Is over 55.
// <div *ngIf="doesNotExercise || over55" [ngClass]="myClasses" > 
// Is at risk of heart disease.</div>
// `,
// styles: [`
//     .warning {
//       font-weight:bold;
// } .danger {
// color:red; }
// `
// ] })
// export class AppComponent { 
//   title = 'app'; 
//   doesNotExercise = false; 
//   over55 = false;

//   myClasses =  {
//     warning: false,
//     danger:  false
//   }
//   adjustCSS() {
//   }
// }




// Example 3
// import { Component } from '@angular/core';
// @Component({
// selector: 'app-root',
// template: `<p [ngClass]="myClasses">class binding example</p>`, styles: [`
//     .warning {
//       font-weight:bold;
// } .danger {
//   color:red; }
//     .highrisk {
//       text-decoration:underline;
// }
// `
// ] })
// export class AppComponent {
//   title = 'app';
//   property1=true
//   property2=true;
//   property3=true;
//   myClasses =  {
//     warning:this.property1,
//     danger:this.property2,
//     highrisk:this.property3
// } }

// Exercise 2
/* import { Component } from '@angular/core';
@Component({
selector: 'app-root',
template: `<label [class.danger]="foodWarning">Has food allergy.</label>
<input type="checkbox" [(ngModel)]="foodWarning" /> <br>
<label [class.makemegreen]="greenWarning">Make me green.</label>
<input type="checkbox" [(ngModel)]="greenWarning" /> `,
styles: [` .danger {
color:orange;
font-weight:bold; }
.makemegreen{ color:green; font-weight:bold;
}
` ]
})
export class AppComponent { 
  foodWarning: Boolean 
  greenWarning:Boolean 
  constructor() {
// Set default value to false. 
this.foodWarning = false; 
this.greenWarning = false;
} } */


// Example 2
// import { Component } from '@angular/core';

// @Component({
//   selector: 'app-root',
//   template: `<label [class.danger]="foodWarning">Has food allergy.</label>
//              <input type="checkbox" [(ngModel)]="foodWarning" />
//             `,
//   styles: [`
//     .danger {
//       color:orange;
//       font-weight:bold;
//     }`
//   ]
// })
// export class AppComponent {
//     foodWarning: Boolean; 
//constructor() {
//       // Set default value to false.
//       this.foodWarning = false;
//     }
// }

