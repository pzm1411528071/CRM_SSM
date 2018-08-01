<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>报表</title>
<script src="${pageContext.request.contextPath }/highcharts/highcharts.js"></script>
<script src="${pageContext.request.contextPath }/highcharts/exporting.js"></script>
<script src="${pageContext.request.contextPath }/highcharts/export-data.js"></script>
<script src="${pageContext.request.contextPath }/resource/js/jquery-1.9.1.js" type="text/javascript"></script>
</head>
<body>
<div id="container" style="min-width: 310px; height: 400px; max-width: 600px; margin: 0 auto"></div>
<script type="text/javascript">
$(function(){
	$.ajax({
		url:"${pageContext.request.contextPath }/customer/pieData",
		type:"post",
		dataType:"json",
		success:function(data){
			init(data);//这里有加载顺序,只能用这种方法,默认是同步,服务器会多开线程,
			           //但是将asyc改为false同步,仍然无法解决加载顺序的问题(与data的作用域有关)
		}
	});
});
function init(data){
	// Make monochrome colors
	var pieColors = (function () {
	    var colors = [],
	        base = Highcharts.getOptions().colors[0],
	        i;

	    for (i = 0; i < 10; i += 1) {
	        // Start out with a darkened base color (negative brighten), and end
	        // up with a much brighter color
	        colors.push(Highcharts.Color(base).brighten((i - 3) / 7).get());
	    }
	    return colors;
	}());

	// Build the chart
	Highcharts.chart('container', {
	    chart: {
	        plotBackgroundColor: null,
	        plotBorderWidth: null,
	        plotShadow: false,
	        type: 'pie'
	    },
	    title: {
	        text: '客户来源占比'
	    },
	    tooltip: {
	        pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
	    },
	    plotOptions: {
	        pie: {
	            allowPointSelect: true,
	            cursor: 'pointer',
	            colors: pieColors,
	            dataLabels: {
	                enabled: true,
	                format: '<b>{point.name}</b><br>{point.percentage:.1f} %',
	                distance: -50,
	                filter: {
	                    property: 'percentage',
	                    operator: '>',
	                    value: 4
	                }
	            }
	        }
	    },
	    series: data
	});
}
</script>
</body>
</html>