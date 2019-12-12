layui.use('table', function(){
    var table = layui.table;
    
    table.render({
      elem: '#test'
      ,url:'/table/wheelhub/2'
      ,cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
      ,cols: [[
        {field:'id', width:200, title: 'ID', sort: true}
        ,{field:'fromaccount', width:200, title: '还款方'}
        ,{field:'toaccount', width:200, title: '贷款方'}
        ,{field:'amount', width:200, title: '金额/元', sort: true}
      ]]
    });
  });