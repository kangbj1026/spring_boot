let footer = document.getElementById("ft");
const today = new Date();
const year = today.getFullYear();
const month = ('0' + (today.getMonth()+1)).slice(-2);
const day = ('0' + (today.getDate())).slice(-2);
const date = year + "-" + month + "-" + day;

let footerContents = document.createElement('p');
footerContents.innerHTML = "© " + year + " KBunny Portfolio Server. All rights reserved.";
footer.appendChild(footerContents);

// const circle = document.querySelector(".circle");
// document.addEventListener("mousemove", (e) => { // mousemove이벤트를 이용해 움
//     // 마우스의 좌표는 clientX와 clientY를 이용해 알수 있다. -> 브라우저 window의 좌표값 위치를 전달한다.
//     // pageX, pageY와는 다름.
//     const mouseX = e.clientX;
//     const mouseY = e.clientY;
//     circle.style.left = mouseX + 20 + 'px';
//     circle.style.top = mouseY + 20 + 'px';
// });