var sidebarActiveMenu = function (id) {
    if (document.getElementById('a_'+menu) != null) {
        document.getElementById('a_'+menu).classList.add("active");
    }

    
    var products = [
        ['1', 'abc'],
        ['2', 'edf'],
        ['3', 'gij'],
        ['4', 'lmn'],
        ['5', 'pqr']
    ];
    //$.noConflict();
    var $table = document.getElementById('productListTable');
    var test = document.getElementById('productListTable');
    console.log('sss')
    if ($table != null && $table.rows.length) {
        console.log('inside the table');
        var temp1 = $table.DataTable();
        $table.DataTable({
            data: products
        });
    }


}

(function() {})