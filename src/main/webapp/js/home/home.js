angular.module('home', []).controller('home', function($scope, $http) {
	$http.get('/AngularJsApp/user/').success(function(data) {
		$scope.user = data.name;
	});
});
