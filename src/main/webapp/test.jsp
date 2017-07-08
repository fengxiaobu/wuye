<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>测试</title>
</head>

<body>

<form id="decinfoedit" enctype="multipart/form-data">
    房产id
    <input type="text" name="houseInfoId" value="1071AM100000000068Q9">
    <br>
    客户名称
    <input type="text" name="clientName" value='热天'>
    <br>
    预计工期 <input type="text" name="creationTime" value='2017-05-05'>


    <input type="text" name="antipateTime" value='55'>
    <br>
    现场管理人
    <input type="text" name="localeCustodian" value='localeCustodian'>
    <br>
    现场管理人联系电话
    <input type="text" name="localeCustodianPhone" value='localeCustodianPhone'>
    <br>
    装修部位
    <input type="text" name="decorationParts" value='decorationParts'>
    <br>
    装修面积
    <input type="text" name="decorateArea" value=''>
    <br>
    施工人数
    <input type="text" name="constructPeopleNumber" value='88'>
    <br>
    装修公司
    <input type="text" name="decorationCompany" value='decorationCompany'>
    <br>
    装修负责人
    <input type="text" name="decorationLeader" value='decorationLeader'>
    <br>
    装修负责人电话
    <input type="text" name="decorationLeaderPhone" value='decorationLeaderPhone'>
    <br>
    是否特殊装修
    <input type="text" name="isSpecialDecoration" value='22'>

    <br>
    (0-不是，1-是)
    <input type="text" name="specialDecorationFile" value='specialDecorationFile'>
    <br>
    特殊装修文件
    <input type="text" name="decorateDetailList[0].detailOrder" value='1'>
    <input type="text" name="decorateDetailList[0].detailContent" value='2'>
    <br>
    <br>
    <br>

    装修详情- 明细顺序
    <!--               <input type="text" name="decorateDetailList.detailOrder" value='decorateDetailList[i].detailOrder'>
              <br>
          装修详情- 明细内容
              <input type="file" name="decorateDetailList.materialAddress" value='decorateDetailList[i].materialAddress'>
              <br>
              <br>
              <br>
          装修资料- 资料名称
              <input type="text" name="decorationMaterialList.materialName" value='decorationMaterialList[i].materialName'>
              <br>
          装修资料- 资料地址
          <input type="file" name="decorationMaterialList.materialAddress" value='decorationMaterialList[i].materialAddress'>
           -->
</form>


<form>

    <table class="table table-bordered table-form">
        <tbody>
        <tr>
            <th>房产名称</th>
            <td>
                <select class="form-control" v-model="userCheckedHouseInfo">
                    <template v-for="(index,houseInfo) in liveInHouseInfos">
                        <option :value="index" :selected="index==0">{{ houseInfo.house }}</option>
                    </template>
                </select>
            </td>
        </tr>
        <tr>
            <th>租赁面积</th>
            <td>32</td>
        </tr>
        <tr>
            <th>租赁起止日期</th>
            <td>
                32
                ~
                32
            </td>
        </tr>
        <tr>
            <th>类型</th>
            <td>
                <select class="form-control" v-model="userCheckedApplyType">
                    <option :value="0">续租</option>
                    <option :value="1">退租</option>
                </select>
            </td>
        </tr>
        <tr v-show="userCheckedApplyType==0">
            <th>续租开始日期</th>
            <td><input class="editdate" id="retreaTimeClick" type="text" v-model="retreaTime"
                       v-datetimepicker="retreaTimeClick"></td>
        </tr>
        <tr v-show="userCheckedApplyType==0">
            <th>续租截止日期</th>
            <td><input class="editdate" id="retreaEndTimeClick" type="text" v-model="retreaEndTime"
                       v-datetimepicker="retreaEndTimeClick"></td>
        </tr>
        <tr v-show="userCheckedApplyType==1">
            <th>退租日期</th>
            <td><input class="editdate" id="retreatLeaseTimeClick" type="text" v-model="retreatLeaseTime"
                       v-datetimepicker="retreatLeaseTimeClick"></td>
        </tr>
        <tr v-show="userCheckedApplyType==1">
            <th>退租类型</th>
            <td>正常退租</td>
        </tr>
        <tr>
            <th></th>
            <td>
                <button class="btn" @click="submit">提交申请</button>
            </td>
        </tr>
        </tbody>
    </table>
</form>
<form id="tui">
    <input type="text" name="houseInfoId" value='22'>
    <input type="text" name="clientName" value='45'>
    <input type="text" name="houseAcreage" value='44'>
</form>

</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/libs/jquery-1.11.3.min.js"></script>
<script type="text/javascript">

    var json = {
        houseInfoId: "11", // 房产id
        clientName: "22", // 客户名称
        houseAcreage: 45, // 房产面积
        leaseStartTime: null, // 租赁开始日期
        leaseEndTime: null, // 租赁结束日期
        retreaTime: null, // 续租开始日期
        retreaEndTime: null // 续租结束时间

    };
    // alert(JSON.stringify(json));


    //         /*请求参数：
    //         --------------------------------------------------*/
    // /*续租*/


    // /*退租*/
    // // houseInfoId: null, // 房产id
    // houseNumber: null, // 房产编号
    // // houseAcreage: null, // 房产面积
    // // leaseStartTime: null, // 租赁开始日期
    // // leaseEndTime: null, // 租赁结束日期
    // retreatLeaseTime: null, // 退租日期
    // arrearsRent: null, // 欠缴租金
    // creationTime: null, // 提交日期
    // updateTime: null, // 修改日期


    var _url = 'http://localhost:8080/wuye/dist' + '/insertReletApply'; // 续租
    var _url = 'http://localhost:8080/wuye/dist' + '/insertRetreatLease'; // 退租申请


    $.ajax({
        type: "post",
        //contentType: "application/json",
        // contentType:"text/json,html,xml;charset=utf-8",
        dataType: 'json',
        url: '${pageContext.request.contextPath}/dist' + '/insertReletApply', //
        data: $('#tui').serialize(),
        /*  data: {
         houseInfoId: "11", // 房产id
         clientName: "22", // 客户名称
         houseAcreage: 45, // 房产面积
         leaseStartTime: null, // 租赁开始日期
         leaseEndTime: null, // 租赁结束日期
         retreaTime: null, // 续租开始日期
         retreaEndTime: null // 续租结束时间

         },  */
        /*  {
         //"\"houseInfoId\"":'222'
         houseInfoId: '222',
         decorateDetailList: [{ // 装修详情
         "detailOrder": '11', // 明细顺序
         "detailContent": '43' // 明细内容
         }]}, */
        /*  clientName: '222',
         antipateTime: '222',
         localeCustodian: '222',
         localeCustodianPhone: '222',
         decorationParts: '222',
         decorateArea: '222',
         constructPeopleNumber: '222',
         decorationCompany: '222',
         decorationLeader: '222',
         decorationLeaderPhone: '222',
         isSpecialDecoration: '222',
         specialDecorationFile: '222',
         decorateDetailList: '222',
         decorateDetailList: [{ // 装修详情
         detailOrder: 'null', // 明细顺序
         detailContent: '43' // 明细内容
         }],
         decorationMaterialList: [{
         materialName: '装修单位《营业执照》《资质等级证书》（加盖公章）',
         materialAddress: ''
         },{
         materialName: '《装修图纸》',
         materialAddress: ''
         },{
         materialName: '《装修承诺书》',
         materialAddress: ''
         },{
         materialName: '《消防安全责任书》',
         materialAddress: ''
         },{
         materialName: '《装修施工委托书》',
         materialAddress: ''
         },{
         materialName: '其它',
         materialAddress: ''
         }]*/
        //    },

        success: function (data) {
            console.log(data);
        }
    });


</script>
</html>
