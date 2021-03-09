
(function() {

    var words = {

        nouns: [ "dog", "cat", "chair", "bed" ],
    
        verbs: [ "eats", "shouts at", "dances with" ],
    
        adverbs: [ "sharply", "quickly", "daintily" ]
    
    };
    
    var spans;
    
    
    function spin() {
        spans.forEach((el) => {
            var use = el.dataset.use;
            var list = words[use];
            var choice = Math.floor(Math.random() * list.length);
            el.innerHTML = list[choice];
        });

    };
    
    
    document.addEventListener("DOMContentLoaded", function() {
       spans = document.querySelectorAll(".word");
       document.querySelector("#spin").addEventListener("click", spin, false);
    });
    
    
})();