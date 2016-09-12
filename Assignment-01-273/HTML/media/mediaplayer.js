var video = document.getElementById("slctvid");
video.addEventListener("change",playvideo,true);


(function (){
	var aud = document.getElementById("first");
	aud.autoplay = true;
	aud.load();
})();

function playvideo()
{
	var videocontainer = document.getElementById("videocontainer");
	var selectedVideo = video.value;
	if(selectedVideo == "msd")
	{
		videocontainer.innerHTML = '';
		videocontainer.innerHTML = '<video controls>'+
								'<source src ="msd.mp4" type="video/mp4">'+
								'</video>'
	}
	else if(selectedVideo == "rockon2")
	{
		videocontainer.innerHTML = '';
		videocontainer.innerHTML = '<video controls>'+
								'<source src ="rockon2.mp4" type="video/mp4">'+
								'</video>'
	}
}