var view = function viewDataFromRest(){
    
    $.getJSON("http://localhost:8080/MobileService/webresources" + "/entity.subscriber", function(data){
        $("div.table-responsive").empty();
        var mytable = '<table class="table table-striped">'+'<thead>' + '<tr>' + '<th>' + "Номер переадресации" + '</th>'+'<th>'+ "Статус переадресации"+ '</th>'+'<th>'+ "Номер контракта"+ '</th>'+'<th>'+ "Имя"+ '</th>'+'<th>'+ "Отчество"+ '</th>'+'<th>'+ "Фамилия"+ '</th>'+'<th>'+ "Номер телефона"+ '</th>'+'<th>'+ "Группа тарифных планов"+ '</th>'+'<th>'+ "Тарифный план"+ '</th>'+'<th>'+ "Статус роуминга" + '</th>'+'</tr>'+'</thead>'+'<tbody>'; 
        
        $.each(data, function(i, item){
            mytable += '<tr><td>' + item.IDcallforwarding.forwardingNumber + '</td><td>' + item.IDcallforwarding.status + '</td><td>'+ item.IDcontract.contractNumber+ '</td><td>' + item.IDcontract.nameClient+ '</td><td>' + item.IDcontract.patronymicClient+ '</td><td>' + item.IDcontract.surnameClient+ '</td><td>' + item.IDcontract.telephoneNumber + '</td><td>' + item.IDtariffplan.IDgrouptariff.groupName + '</td><td>' + item.IDtariffplan.tariffName + '</td><td>' + item.roaming + '</td></tr>';
        });
        mytable += '</tbody>'+'</table>';
        $("div.table-responsive").append(mytable);
                        
    });
};

var add = function addDataToRestContract(){    
    
    $.getJSON("http://localhost:8080/MobileService/webresources/entity.contract", function(data){
        $("div.table-responsive").empty();
        var mytable = '<table class="table table-striped">'+'<thead>' + '<tr>' + '<th>' + "Номер переадресации" + '</th>'+'<th>'+ "Статус переадресации"+ '</th>'+'<th>'+ "Номер контракта"+ '</th>'+'<th>'+ "Имя"+ '</th>'+'<th>'+ "Отчество"+ '</th>'+'<th>'+ "Фамилия"+ '</th>'+'<th>'+ "Номер телефона"+ '</th>'+'<th>'+ "Группа тарифных планов"+ '</th>'+'<th>'+ "Тарифный план"+ '</th>'+'<th>'+ "Статус роуминга" + '</th>'+'</tr>'+'</thead>'+'<tbody>'; 
        
        $.each(data, function(i, item){
            mytable += '<tr><td>' + item.IDcallforwarding.forwardingNumber + '</td><td>' + item.IDcallforwarding.status + '</td><td>'+ item.IDcontract.contractNumber+ '</td><td>' + item.IDcontract.nameClient+ '</td><td>' + item.IDcontract.patronymicClient+ '</td><td>' + item.IDcontract.surnameClient+ '</td><td>' + item.IDcontract.telephoneNumber + '</td><td>' + item.IDtariffplan.IDgrouptariff.groupName + '</td><td>' + item.IDtariffplan.tariffName + '</td><td>' + item.roaming + '</td></tr>';
        });
        mytable += '</tbody>'+'</table>';
        $("div.table-responsive").append(mytable);
                        
    });
};




$(document).on('click','#view-subscribers',function(e){
    e.preventDefault();
    view();
    console.log('testing');
});

$(document).on('click','#new-contract',function(e){
    e.preventDefault();
     $("div.table-responsive").empty();
     var newForm = $("div.table-responsive").append(
        $("<h3/>").text("Данные о договоре"), $("<br/><br/>"), 
        $('<form/>', {
            action: '#',
            method: '#'
        }).append($("<input/>", {
            type: 'text',
            id: 'typeName',
            name: 'typeName',
            placeholder: 'Тип лица'
        }),$("<br/><br/>"), $("<input/>", {
            type: 'text',
            id: 'contractNumber',
            name: 'contractNumber',
            placeholder: 'Номер контракта'
        }),$("<br/><br/>"), 
        $("<input/>", {
            type: 'text',
            id: 'dateOfConclusion',
            name: 'dateOfConclusion',
            placeholder: 'Дата заключения'
        }),$("<br/><br/>"), 
        $("<input/>", {
            type: 'text',
            id: 'telephoneNumber',
            name: 'telephoneNumber',
            placeholder: 'Номер телефона'
        }),$("<br/><br/>"), 
        $("<input/>", {
            type: 'text',
            id: 'surnameClient',
            name: 'surnameClient',
            placeholder: 'Фамилия'
        }),$("<br/><br/>"), 
        $("<input/>", {
            type: 'text',
            id: 'nameClient',
            name: 'nameClient',
            placeholder: 'Имя'
        }),$("<br/><br/>"), 
        $("<input/>", {
            type: 'text',
            id: 'patronymicClient',
            name: 'patronymicClient',
            placeholder: 'Отчество'
        }),$("<br/><br/>"), 
        $("<br/>"), $("<input/>", {
            type: 'submit',
            id: 'submit',
            value: 'Submit'
        })));
                
                
    console.log('testing');
});

