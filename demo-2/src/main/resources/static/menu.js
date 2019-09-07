//debugger;


var app = app || {};

app.init = function (){
    var self = this;
    var html = "";
    html += "<ul>";
    
    //alert(app_menu.data);
    
    var arr = self.data;
    var json_obj = Object.keys(arr).length;
    
    debugger;
    for(var i=1;i<=json_obj;i++){
      html += "<li><a href="+arr[i]['url']+">"+arr[i]['title']+"</a></li>";
    }
    
    html += "</ul>";
    
    document.getElementById("id_menu_bar").innerHTML = html;
  };
  
app.data = {
	   "1":{
		   url: "https://www.google.co.jp",
		   title: "Google"
	    },
	    "2":{
		   url: "https://www.yahoo.co.jp",
		   title: "Yahoo!"
	    },
	    "3":{
		   url: "https://github.com/kenriki",
		   title: "Github"
	    },
	    "4":{
		   url: "https://developer.mozilla.org/ja/",
		   title: "MDN web docs"
	    },
	    "5":{
		   url: "https://developer.ibm.com/technologies/java/",
		   title: "IBM Developer"
	    },
		    
   };
