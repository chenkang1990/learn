// infoadd.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    // 类目
    categories: [],
    // 点击的类目
    activeCategoryId: 1,
    goods: [],
 
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    this.getCategorys();
    this.getGoodsList(1);
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {
  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {
  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {
  
  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {
  
  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {
  
  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {
  
  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {
  
  },

  tabClick: function (e) {
    this.setData({
      activeCategoryId: e.currentTarget.id
    });
    this.getGoodsList(this.data.activeCategoryId);
  },

  // 获取类目
  getCategorys : function (e) {
    const self = this
    wx.request({
      url: 'http://199.168.3.140/categorys',
      success: function (res) {
        self.setData({
          categories: res.data
        });
      }
    })

  },

  getGoodsList: function (e) {
    var categoryId = e;
    const self = this;
    wx.request({
      url: 'http://199.168.3.140/items',
      data: { categoryId: categoryId},
      success: function (res) {
        self.setData({
          goods: res.data
        });
      }
    })
  },
})