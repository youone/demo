/*
 * ATTENTION: The "eval" devtool has been used (maybe by default in mode: "development").
 * This devtool is neither made for production nor for readable output files.
 * It uses "eval()" calls to create a separate source file in the browser devtools.
 * If you are trying to read the output file, select a different devtool (https://webpack.js.org/configuration/devtool/)
 * or disable the default devtool with "devtool: false".
 * If you are looking for production-ready output files, see mode: "production" (https://webpack.js.org/configuration/mode/).
 */
/******/ (() => { // webpackBootstrap
/******/ 	var __webpack_modules__ = ({

/***/ "./src/index.js":
/*!**********************!*\
  !*** ./src/index.js ***!
  \**********************/
/***/ (() => {

eval("console.log('hej hopsan');\r\n\r\n(async () => {\r\n\r\n    const data = await fetch('http://localhost:8080/api/v2/test')\r\n        .then(response => response.text())\r\n        .then(data => data)\r\n    console.log(data);\r\n\r\n\r\n    const product = {\r\n        name: 'milk',\r\n        unit: 'dl'\r\n    }\r\n    const p = await fetch('http://localhost:8080/api/v2/product', {\r\n        headers: {'Content-Type': 'application/json'},\r\n        method: 'POST',\r\n        body: JSON.stringify(product)\r\n    })\r\n        .then(response => response.json())\r\n        .then(data => data)\r\n    console.log(p);\r\n\r\n    const ingredient = {\r\n        product: {\r\n            id: 1\r\n            // name: 'milk',\r\n            // unit: 'dl'\r\n        },\r\n        amount: 2,\r\n        unit: 'dl'\r\n    }\r\n    const i = await fetch('http://localhost:8080/api/v2/ingredient', {\r\n        headers: {'Content-Type': 'application/json'},\r\n        method: 'POST',\r\n        body: JSON.stringify(ingredient)\r\n    })\r\n        .then(response => response.json())\r\n        .then(data => data)\r\n    console.log(i);\r\n\r\n\r\n\r\n\r\n})()\r\n\r\n\r\n\r\n\n\n//# sourceURL=webpack://static/./src/index.js?");

/***/ })

/******/ 	});
/************************************************************************/
/******/ 	
/******/ 	// startup
/******/ 	// Load entry module and return exports
/******/ 	// This entry module can't be inlined because the eval devtool is used.
/******/ 	var __webpack_exports__ = {};
/******/ 	__webpack_modules__["./src/index.js"]();
/******/ 	
/******/ })()
;