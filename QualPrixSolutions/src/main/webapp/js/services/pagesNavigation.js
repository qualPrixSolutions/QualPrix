function configNavigation($routeProvider) {
 
	'use strict';
    
	$routeProvider.when('/', {
		templateUrl : '/QualPrixSolutions/service/changePage'
	}).when('/QualPrixSolutions/service/locations', {
		templateUrl : '/QualPrixSolutions/service/changePage'
	}).when('/QualPrixSolutions/service/sponsors', {
		templateUrl : '/QualPrixSolutions/service/changePage'
	}).when('/QualPrixSolutions/service/shopping', {
		templateUrl : '/QualPrixSolutions/service/changePage'
	}).when('/QualPrixSolutions/service/suppotService', {
		templateUrl : '/QualPrixSolutions/service/changePage'
	}).when('/QualPrixSolutions/service/tutorialAstuce', {
		templateUrl : '/QualPrixSolutions/service/changePage'
	}) 
	  
}