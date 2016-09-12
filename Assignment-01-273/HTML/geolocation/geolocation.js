var map;

function initializeMap(){

	map = new google.maps.Map(document.getElementById('map'),{
		center: {lat: 18.533333, lng : 73.866667},
		zoom : 15
	});

	var pos = {};
	var storeLocation = {};
  	var mapInfoWindow = new google.maps.InfoWindow({
    map: map
 	 });
  	var storeReq = {}; 

  	if(navigator.geolocation){

  		navigator.geolocation.getCurrentPosition(function(position){

  			var pos = {
  				lat : position.coords.latitude,
  				lng : position.coords.longitude
  			}
  			storeLocation =new google.maps.LatLng(pos);

  			storeReq = {
  				location: storeLocation,
        		radius: 500,
       			 types: ['store']
  			}

  			mapInfoWindow.setPosition(pos);
  			mapInfoWindow.setContent("You are Here");
  			map.setCenter(pos);

  			var storeservice = new google.maps.places.PlacesService(map)
  			storeservice.nearbySearch(storeReq,handler)

  		})
  	}
}

function handler(stores,status){
	
	if (status === google.maps.places.PlacesServiceStatus.OK) {

		for (var i = 0; i < stores.length; i++) {
      		
      		dispStores(stores[i]);
    	}
	}

}
function dispStores(store) {

	var storeLoc = store.geometry.location;
	var pointer = new google.maps.Marker({
    map: map,
    position: store.geometry.location
  });

google.maps.event.addListener(pointer, 'click', function(){
	 mapInfoWindow.setContent(store.name);
    mapInfoWindow.open(map, this);
})

}
google.maps.event.addDomListener(window, "load", initializeMap);