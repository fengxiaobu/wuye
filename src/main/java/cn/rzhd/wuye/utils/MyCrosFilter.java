package cn.rzhd.wuye.utils;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.Assert;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.CorsProcessor;
import org.springframework.web.cors.CorsUtils;
import org.springframework.web.cors.DefaultCorsProcessor;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.OncePerRequestFilter;

/**
 * @ClassName MyCrosFilter
 * @Description 处理ajax跨域问题
 * @author qinjuncai
 * @Date 2017年6月5日 下午4:46:50
 * @version 1.0.0
 */
public class MyCrosFilter extends OncePerRequestFilter {

    private final CorsConfigurationSource configSource;
    private CorsProcessor processor = new DefaultCorsProcessor();

    /**
     * Constructor accepting a {@link CorsConfigurationSource} used by the filter to find the {@link CorsConfiguration}
     * to use for each incoming request.
     * 
     * @see UrlBasedCorsConfigurationSource
     */

    public MyCrosFilter(CorsConfigurationSource configSource) {

        Assert.notNull(configSource, "CorsConfigurationSource must not be null");

        this.configSource = configSource;

    }

    /**
     * Configure a custom {@link CorsProcessor} to use to apply the matched {@link CorsConfiguration} for a request.
     * <p>
     * By default {@link DefaultCorsProcessor} is used.
     */

    public void setCorsProcessor(CorsProcessor processor) {

        Assert.notNull(processor, "CorsProcessor must not be null");

        this.processor = processor;

    }

    @Override

    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,

            FilterChain filterChain) throws ServletException, IOException {

        if (CorsUtils.isCorsRequest(request)) {

            // System.out.println("ORGIN----"+request.getHeader("Origin"));

            response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));

            // response.setHeader("Access-Control-Allow-Origin", "http://172.16.10.156:8088");

            response.setHeader("Access-Control-Allow-Credentials", "true");

            CorsConfiguration corsConfiguration = this.configSource.getCorsConfiguration(request);

            if (corsConfiguration != null) {

                boolean isValid = this.processor.processRequest(corsConfiguration, request, response);

                if (!isValid || CorsUtils.isPreFlightRequest(request)) {

                    return;

                }

            }

        }

        filterChain.doFilter(request, response);

    }

}
