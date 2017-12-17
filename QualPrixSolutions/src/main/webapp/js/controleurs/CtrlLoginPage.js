angular.module("QualPrixSolApp").controller('LoginPageCtrl', function($scope,$http){
	$scope.firstname ='';
	$scope.lastName ='';
	$scope.email = '';
	$scope.login = '';
	$scope.password = '';
	$scope.birthday = '';
	$scope.phoneNumber = '';
	$scope.country = '';
	$scope.city = '';
	$scope.codePostal = '';
	$scope.street = '';
	$scope.streetNumber = '';
    $scope.sendInfoPersonne = function () {
    	  var newPersonne = {firstname:$scope.firstname,lastName:$scope.lastName,email:$scope.email,
    			  login:$scope.login,password:$scope.password,birthday:$scope.birthday,
    			  phoneNumber:$scope.phoneNumber,country:$scope.country,city:$scope.city,
    			  codePostal:$scope.codePostal,street:$scope.street,streetNumber:$scope.streetNumber};
    	  $http.post('http://localhost:9080/QualPrixSolutions/service/insertInfoPersonne',newPersonne);
     };
});