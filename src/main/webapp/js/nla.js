/**
 * Search through the table.
 * If found, then only show those rows and hide others
 * @returns
 */
function filterResults(searchText, tableId) {
  // Declare variables 
  var input, filter, table, tr, bookTitle, bookAuthor, i;
  
  input = document.getElementById(searchText);
  
  filter = input.value.toUpperCase();
  
  table = document.getElementById(tableId);
  
  tr = table.getElementsByTagName("tr");

  // Loop through all table rows, and hide those who don't match the search query
  for (i = 0; i < tr.length; i++) {
	  
    bookTitle = tr[i].getElementsByTagName("td")[0];
    
    bookAuthor = tr[i].getElementsByTagName("td")[1];
    
    if (bookTitle || bookAuthor) {
    	
      if (bookTitle.innerHTML.toUpperCase().indexOf(filter) > -1 ||
    		  bookAuthor.innerHTML.toUpperCase().indexOf(filter) > -1) {
        tr[i].style.display = "";
      } 
      else {
        tr[i].style.display = "none";
      }
    } 
  }
}