package cn.rzhd.wuye.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * luopa 在 2017/6/7 创建.
 */
@Controller
@RequestMapping("/dist")
public class DecorationNoticeController {
  /*  @Autowired
    IDecorationNoticeService decorationNoticeService;

    @RequestMapping("/decorationNotice/list")
    @ResponseBody
    public String selectAll() {
        List<DecorationNotice> decorationNotices = decorationNoticeService.selectAll();
        DecorationNotice decorationNotice = null;
        String jsonString = "没有数据!";
        if (decorationNotices.size() > 0) {
            decorationNotice = decorationNotices.get(0);
            jsonString = JSON.toJSONString(decorationNotice, SerializerFeature.WriteMapNullValue);
        }
        return jsonString;
    }

    *//**
     * 装修申请
     * @param request
     * return
     *//*
    @RequestMapping(value = "/upload/batch", method = RequestMethod.POST)
    public @ResponseBody String batchUpload(HttpServletRequest request, DecorationMaterial decorationMaterial, DecorationApply decorationApply) {
        System.out.println("decorationMaterial = " + decorationMaterial);
        System.out.println("decorationApply = " + decorationApply);
        fileUpload(request);

        return "";
    }

    *//**
     *
     * @param file
     * @return
     *//*
    *//*@RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public String upload(@RequestParam("file") MultipartFile file) {
        if (!file.isEmpty()) {
            try {
                // 这里只是简单例子，文件直接输出到项目路径下。
                // 实际项目中，文件需要输出到指定位置，需要在增加代码处理。
                // 还有关于文件格式限制、文件大小限制，详见：中配置。
                BufferedOutputStream out = new BufferedOutputStream(
                        new FileOutputStream(new File(file.getOriginalFilename())));
                out.write(file.getBytes());
                out.flush();
                out.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return "上传失败," + e.getMessage();
            } catch (IOException e) {
                e.printStackTrace();
                return "上传失败," + e.getMessage();
            }
            return "上传成功";
        } else {
            return "上传失败，因为文件是空的.";
        }
    }*//*
    *//**
     * 文件上传
     * @param request
     * @return
     *//*
    private String fileUpload(HttpServletRequest request) {
        List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");
        MultipartFile file = null;
        BufferedOutputStream stream = null;
        for (int i = 0; i < files.size(); ++i) {
            file = files.get(i);
            if (!file.isEmpty()) {
                try {
                    byte[] bytes = file.getBytes();
                    stream = new BufferedOutputStream(new FileOutputStream(new File(file.getOriginalFilename())));
                    stream.write(bytes);
                    stream.close();
                } catch (Exception e) {
                    stream = null;
                    return "上传失败" + i + " => " + e.getMessage();
                }
            } else {
                return "上传失败 " + i + "文件是空的.";
            }
        }
        return "上传成功!";
    }

*/
}
