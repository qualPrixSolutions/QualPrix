angular.module("QualPrixSolApp").controller('ContactsCtrl', function($scope,$http){
	 $scope.showContacts=false;
	 $scope.name ='';
	 $scope.email ='';
	 $scope.phone ='';
	 $scope.message ='';
	 $scope.contact_message = {};
     $scope.sendMessage = function () {
    	  var message = {name:$scope.name,email:$scope.email,phone:$scope.phone,message:$scope.message};
    	  $http.post('http://localhost:9080/QualPrixSolutions/service/sendMessage',message);
     };
});