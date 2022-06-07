
// ********* Example 11 Storage Object *************
// import { Component } from '@angular/core'; 
// @Component({
//     template: `This is page b. {{retrievedFromStorage}}
//     <input type="input"  (ngModelChange)="mychange($event)" [ngModel]="mymodel">`

// })
// export class PageBComponent {
//    id! : number;
//    firstName! : string;
//    val!:string;

//     mychange(val:string) {
//         sessionStorage.setItem("autosave", val);
// console.log(val); // updated value }
// }
// }

// Excercise 15
// import { Component } from '@angular/core'; 
// @Component({
//     template: `This is page b. {{retrievedFromStorage}}
//     <input type="input" (ngModelChange)="mychange($event)" [ngModel]="mymodel">
//     <input type="input" (ngModelChange)="mychange2($event)" [ngModel]="mymodel2">` 
    
// })
//     export class PageBComponent { 
//         constructor() {
//     } 
//     mychange(val:string) {
//         sessionStorage.setItem("autosave", val);
//         console.log(val); // updated value 
//     }
//         mychange2(val2: string)
//          { sessionStorage.setItem("autosave2", val2); 
//          console.log(val2); // updated value

//         } 
//     }

// ********* Example 10 *************
import { Component } from '@angular/core';
import { ActivatedRoute, Params } from '@angular/router';
@Component({
    template: `ID: {{id}}<br/>
               Name: {{firstName}}`
})
export class PageBComponent {
    id!: number;
    firstName!: string;

// The constructor sets up the class.
constructor(private route: ActivatedRoute) {
    let str = "This is where the class is initialized.";
}
// ngOnInit() gets called after the class is set up.
// At this point, the class is able to handle the parameters passed to it. 
ngOnInit() {
this.route.params.forEach((params: Params) => {
    let localID = params['id'];
    let localName = params['firstname'];
    
    this.id = localID;
    this.firstName = localName;
});
}
}





// ********* Example 8 & 9 *************
// import { Component } from '@angular/core'; @Component({
//     template: `This is another page.`
// })
// export class PageBComponent { }




// ********* Example 7 *************

// ********* Example 6 *************

// ********* Example 5 *************

// ********* Example 4 *************

// ********* Example 3 *************

// ********* Example 2 *************

// ********* Example 1 *************