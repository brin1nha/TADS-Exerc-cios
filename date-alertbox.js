/* this is using  <body onload="showDaterAlertBox()">  on a index.html to show the alert box*/

var currentDate, currentTime, weekDays, currentWeekDay, greetingShift;
const arrayContentAlertBox = [currentDate, currentTime, weekDays, currentWeekDay, greetingShift];
arrayContentAlertBox[0] = new Date();
arrayContentAlertBox[1] = arrayContentAlertBox[0].getHours();
arrayContentAlertBox[2] = ["monday", "sunday", "tuesday", "wednesday", "thursday", "friday", "saturday"];
arrayContentAlertBox[3] = arrayContentAlertBox[2][arrayContentAlertBox[0].getDay()];
//arrayContentAlertBox[4] = :
    if(arrayContentAlertBox[1] <= (12)){
    arrayContentAlertBox[4] = "Good morning!";
    }else if (arrayContentAlertBox[1]>=(12) && currentTime<=(18)){
    arrayContentAlertBox[4] = "Good evening!";
    }else {
    arrayContentAlertBox[4] = "Good night!";
    }

    function showDateAlertBox() {
    alert(arrayContentAlertBox[4] +" Today is " +arrayContentAlertBox[3])
    }
