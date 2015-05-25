angular.module('message', []).controller('message', function($scope, $http) {
	$http.get('/AngularJsApp/resource/').success(function(data) {
		$scope.greeting = data;
	});
});
