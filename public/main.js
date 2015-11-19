function getFiles(filesData) {
    for (var i in filesData) {
        var elem = $("<a>");
        elem.attr("href", filesData[i].name);
        elem.text(filesData[i].comment);
        $("#filelist").append(elem);
        var elem2 = $("<br>");
        $("#filelist").append(elem2);
    }
}

$.get("/files", getFiles);