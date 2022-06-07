// ********* Example 11 *************
// import { NgModule } from '@angular/core';
// import { FormsModule } from '@angular/forms';
// import { BrowserModule } from '@angular/platform-browser';
// import { AppComponent } from './app.component';


// @NgModule({
//   declarations: [
//     AppComponent
//   ],
//   imports: [
//     BrowserModule,
//    FormsModule
//   ],
//   providers: [],
//   bootstrap: [AppComponent]
// })
// export class AppModule { }

// Excercise 15



// ********* Example 8,9 & 10 *************

import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { PageAComponent } from './app.page-a';
import { PageBComponent } from './app.page-b';
import { PageDefault } from './app.pagedefault';
import { routing } from './app.routing';

@NgModule({
  declarations: [
    AppComponent, PageDefault,  PageAComponent, PageBComponent
   
  ],
  imports: [
    BrowserModule,
   FormsModule, routing
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }


// ********* Example 7 *************
// import { BrowserModule } from '@angular/platform-browser';
// import { NgModule } from '@angular/core';
// import { FahrenheitPipe } from './app.fahrenheitPipe';
// import { AppComponent } from './app.component';
// import { FormsModule } from '@angular/forms';

// @NgModule({
//     declarations: [ AppComponent,
//                     FahrenheitPipe ],
//     imports:      [ BrowserModule, 
//                   FormsModule, ],
  
//     providers: [],
//     bootstrap: [AppComponent]
// })
// export class AppModule { }


// ********* Example 6 *************

// ********* Example 5 *************

// ********* Example 4 *************
// import { NgModule } from '@angular/core';
// import { BrowserModule } from '@angular/platform-browser'; 
// import { MyDataService } from './myDataService';
// import { ThirdDirective } from './thirdDirective';
// import { AppComponent } from './app.component';
// @NgModule({
//     imports:      [ BrowserModule ],
//     declarations: [ AppComponent ],
//     bootstrap:    [ AppComponent ]
// })
// export class AppModule { }



// ********* Example 3 *************
// import { NgModule } from '@angular/core';
// import { BrowserModule } from '@angular/platform-browser'; 
// import { NewDirective } from './newDirective';
// import { ThirdDirective } from './thirdDirective';
// import { AppComponent } from './app.component';
// @NgModule({
//     imports:      [ BrowserModule ],
//     declarations: [ AppComponent, NewDirective, ThirdDirective ],
//     bootstrap:    [ AppComponent ]
// })
// export class AppModule { }


// ********* Example 2 *************
// import { NgModule } from '@angular/core';
// import { BrowserModule } from '@angular/platform-browser'; 
// import { NewDirective } from './newDirective';
// import { ThirdDirective } from './thirdDirective';
// import { AppComponent } from './app.component';
// @NgModule({
//     imports:      [ BrowserModule ],
//     declarations: [ AppComponent, NewDirective, ThirdDirective ],
//     bootstrap:    [ AppComponent ]
// })
// export class AppModule { }

// ********* Exercise 4 *************
// import { NgModule } from '@angular/core';
// import { BrowserModule } from '@angular/platform-browser'; 
// import { NewDirective } from './newDirective';
// import { ThirdDirective } from './thirdDirective';
// import { AppComponent } from './app.component';
// @NgModule({
//     imports:      [ BrowserModule ],
//     declarations: [ AppComponent, NewDirective, ThirdDirective ],
//     bootstrap:    [ AppComponent ]
// })
// export class AppModule { }

// ********* Example 1 *************