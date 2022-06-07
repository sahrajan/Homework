// ********* Example 4 Creating A service  *************
import { Component } from '@angular/core';
// This is the service.
export class MyDataService {
    names: Array<any>;
    constructor() {
        this.names = ['John', 'Mary', 'Joan'];
    }
    getNames() {
        return this.names;
} }