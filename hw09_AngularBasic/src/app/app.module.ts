import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser'; 
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
@NgModule({
    imports: [BrowserModule, FormsModule],
    declarations: [AppComponent],
    bootstrap: [AppComponent]
})
export class AppModule { }


// ************* Example 4 ******************
// import { NgModule } from '@angular/core';
// import { BrowserModule } from '@angular/platform-browser'; 
// import { FormsModule } from '@angular/forms';
// import { AppComponent } from './app.component';
// @NgModule({
//     imports: [BrowserModule, 
//               FormsModule],

//     declarations: [AppComponent],

//     bootstrap: [AppComponent]
// })
// export class AppModule { }

// ************ Example 2, 3 && Excercise 5 *************
// import { NgModule } from '@angular/core';
// import { BrowserModule } from '@angular/platform-browser';
// import { FormsModule } from '@angular/forms';
// import { AppRoutingModule } from './app-routing.module';
// import { AppComponent } from './app.component';

// @NgModule({
//   declarations: [
//     AppComponent
//   ],
//   imports: [
//     BrowserModule,
//     FormsModule,
//     AppRoutingModule
//   ],
//   providers: [],
//   bootstrap: [AppComponent]
// })
// export class AppModule { }
