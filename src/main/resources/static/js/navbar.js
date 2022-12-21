function navItems() {
    let links = [
        ['Introduce', './'],
        ['Projects', './projects.html'],
        ['Contact', './contact.html'],
        ['StudyIng', './studying.html']
    ];

    let navbar = document.getElementsByClassName('navbar');
    let navDiv = document.createElement('div');
    navDiv.classList.add("menu");
    let navUl = document.createElement('ul');
    navUl.classList.add("menu_list");

    links.map((link) => {
        let itemsLi = document.createElement('li');
    itemsLi.classList.add("nav-item");
    let aTag = document.createElement('a');

    aTag.innerHTML = link[0];
    aTag.href = link[1];
    itemsLi.appendChild(aTag);
    navUl.appendChild(itemsLi);
});

    navDiv.appendChild(navUl);
    navbar[0].appendChild(navDiv);
}
navItems();