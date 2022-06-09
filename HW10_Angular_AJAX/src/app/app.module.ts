// Example 9
import { BrowserModule } from '@angular/platform-browser'; import { NgModule } from '@angular/core';
import { HighlightDirective } from './app.highlight.directive'; import { AppComponent } from './app.component';
@NgModule({
  declarations: [
    AppComponent,HighlightDirective
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }



// Example 7
// import { BrowserModule } from '@angular/platform-browser'; import { NgModule } from '@angular/core';
// import { FormsModule } from '@angular/forms';
// import { AppComponent } from './app.component';
// @NgModule({
//   declarations: [
//     AppComponent
//   ],
//   imports: [
//     BrowserModule, FormsModule
//   ],
//   providers: [],
//   bootstrap: [AppComponent]
// })
// export class AppModule { }


//Example 3
// import { BrowserModule } from '@angular/platform-browser'; 
// import { NgModule } from '@angular/core';
// import {ChildComponent } from './app.child';
// import { FormsModule } from '@angular/forms';
// import { AppComponent }  from './app.component';

// @NgModule({
//   declarations: [
//     AppComponent, 
//     ChildComponent,
//   ],

// imports: [
//     BrowserModule, 
//     FormsModule
//   ],

//   providers: [],

//   bootstrap: [AppComponent]

// })
// export class AppModule { }




// Example 2
// import { NgModule } from '@angular/core';
// import { BrowserModule } from '@angular/platform-browser';

// import { AppRoutingModule } from './app-routing.module';
// import { AppComponent } from './app.component';

// import { FormsModule } from '@angular/forms';
// import { HttpClientModule } from '@angular/common/http'

// @NgModule({
//   declarations: [
//     AppComponent
//   ],
//   imports: [
//     BrowserModule,
//     HttpClientModule,
//     FormsModule,
//     AppRoutingModule
//   ],
//   providers: [],
//   bootstrap: [AppComponent]
// })
// export class AppModule { }
