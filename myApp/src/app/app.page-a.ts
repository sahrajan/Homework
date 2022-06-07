import { Component } from '@angular/core'; 

// ********* Example 11 *************
// @Component({
//     template: `This is page A.<br>This content was set in page-b: {{someItem}}` })
//     export class PageAComponent {
//         someItem!: string;
//         constructor() {
//             if (sessionStorage.getItem("autosave")) {
//                 this.someItem = sessionStorage.getItem("autosave");
//     } }
// }

//Exercise 15
//import { Component } from '@angular/core'; 
// @Component({
//     template: `This is page A.<br>This content was set in page-b: {{someItem}} {{someItem2}}` 
// })
//     export class PageAComponent { 
//         someItem!: string; 
//         someItem2!: string;
//     constructor() {
//     if (sessionStorage.getItem("autosave") && sessionStorage.getItem("autosave2")) {
//     this.someItem = sessionStorage.getItem("autosave");
//     this.someItem2 = sessionStorage.getItem("autosave2");
//     } }
//     }


// ********* Example 10 *************
@Component({
    templateUrl:'./pageA.html'
})

export class PageAComponent { }



// ********* Example 8 & 9 *************
// @Component({
//     template: `This is page A.`
// })
// export class PageAComponent { }






