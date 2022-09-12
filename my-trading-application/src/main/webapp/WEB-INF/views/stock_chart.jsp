<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="https://canvasjs.com/assets/script/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="https://canvasjs.com/assets/script/canvasjs.stock.min.js"></script>
<script type="text/javascript">
window.onload = function () {
  var dataPoints1 = [], dataPoints2 = [];
  var stockChart = new CanvasJS.StockChart("chartContainer",{
    title:{
      text:"Async Data Loading in StockChart"
    },
    rangeChanged: rangeChanged,
    charts: [{
      axisY2: {
        prefix: "$"
      },
      data: [{
        type: "candlestick",
        yValueFormatString: "$#,###.##",
        axisYType: "secondary",
        dataPoints : dataPoints1
      }]
    }],
    navigator: {
      dynamicUpdate: false,
      data: [{
        dataPoints: dataPoints2
      }],
      slider: {
        minimum: new Date(2022, 09, 11),
        maximum: new Date(2022, 09, 12)
      }
    }
  });
  function addData(data) {
    stockChart.options.charts[0].data[0].dataPoints = [];
    
    for(var i = 0; i < data.length; i++){
    	
      stockChart.options.charts[0].data[0].dataPoints.push({x: new Date(data[i]._dateTime), y: [ Number(data[i].open), Number(data[i].high), Number(data[i].low), Number(data[i].close) ]});
    }
    stockChart.render();
  }
  function rangeChanged(e) {
    var minimum = parseInt(e.minimum / 1000);
    var maximum = parseInt(e.maximum / 1000);
    var url = "http://localhost:8080/price/amazon"
    $("#loader").css("display", "block");
    $.getJSON(url, function(data) {
    	
      addData(data);
      $("#loader").css("display", "none");
    });
  }
  $("#loader").css("display", "block");
  $.getJSON("http://localhost:8080/price/amazon", function(data) {
	  
    for(var i = 0; i < data.length; i++){
    	console.log(data[i]);
    	console.log(new Date(data[i].dateTime*1000));
      dataPoints1.push({x: new Date(data[i]._dateTime), y: [Number(data[i].open), Number(data[i].high), Number(data[i].low), Number(data[i].close)]});
      dataPoints2.push({x: new Date(data[i]._dateTime), y: Number(data[i].close)});
    }
    $("#loader").css("display", "none");
    stockChart.render();
  });
}
</script>

</head>
<body>

Hello
<div id="chartContainer" style="height: 450px; width: 100%;"></div>
<img id="loader" src="https://canvasjs.com/wp-content/uploads/images/gallery/javascript-stockcharts/overview/loading.gif" style="position: absolute; top: 150px; left: 48%; display: none"/>
</body>
</html>