package com.deng.recipes.utils;

/**
 * Created by hcdeng on 2017/4/21.
 */
public class Constants {
    public static final String IMAGE_DIR = "D:\\data\\iamges\\";
    public static final String RECIPES_DIR = "D:\\data\\recipes\\";
    public static final String HTML_DIR = "D:\\data\\htmls\\";
    public static final String ES_INDEX_NAME = "deng-recipes";
    public static final String BEGIN_URL = "http://www.meishij.net/chufang/diy/";



    public static final String[] proxys = new String[]{
           // "122.142.77.84, 8081, 10", "122.142.77.84, 82, 10", "122.142.77.84, 80, 10", "122.142.77.84, 82, 10", "60.21.206.165, 9999, 10", "122.142.77.84, 8081, 10", "59.53.140.173, 808, 10", "60.21.206.165, 9999, 10", "60.21.206.165, 9999, 10", "122.142.77.84, 8081, 10", "122.142.77.84, 8081, 10", "60.21.206.165, 9999, 10", "122.142.77.84, 8081, 10", "122.142.77.84, 80, 10", "122.142.77.84, 82, 10", "122.142.77.84, 80, 10", "122.142.77.84, 82, 10", "122.142.77.84, 82, 10", "122.142.77.84, 80, 10", "125.88.74.122, 83, 10", "125.88.74.122, 83, 10", "125.88.74.122, 83, 10", "122.142.77.84, 8081, 10", "113.123.79.122, 808, 10", "119.237.211.19, 3128, 10", "122.142.77.84, 80, 10", "125.88.74.122, 83, 10", "125.88.74.122, 83, 10", "125.88.74.122, 83, 10", "60.21.206.165, 9999, 10", "223.153.207.152, 808, 10", "60.21.206.165, 9999, 10", "122.142.77.84, 8081, 10", "218.64.93.150, 808, 10", "122.142.77.84, 82, 10", "60.21.206.165, 9999, 10", "122.142.77.84, 8081, 10", "122.142.77.84, 82, 10", "183.222.237.84, 8123, 10", "122.142.77.84, 82, 10", "122.142.77.84, 8081, 10", "218.201.98.196, 3128, 10", "114.230.30.190, 808, 10", "125.88.74.122, 83, 10", "122.142.77.84, 80, 10", "122.142.77.84, 82, 10", "122.142.77.84, 80, 10", "113.123.79.122, 808, 10", "202.197.127.139, 1209, 10", "122.142.77.84, 82, 10", "122.142.77.84, 80, 10", "171.12.165.121, 808, 10", "122.142.77.84, 8081, 10", "125.88.74.122, 83, 10", "122.142.77.84, 80, 10", "61.191.41.130, 80, 10", "122.142.77.84, 82, 10", "60.21.206.165, 9999, 10", "122.142.77.84, 80, 10", "60.21.206.165, 9999, 10", "223.153.207.152, 808, 10", "122.142.77.84, 80, 10", "119.237.211.19, 3128, 10", "122.142.77.84, 8081, 10", "125.88.74.122, 83, 10", "60.21.206.165, 9999, 10", "122.142.77.84, 80, 10", "119.237.211.19, 3128, 10", "122.142.77.84, 80, 10", "61.191.41.130, 80, 10", "202.197.127.139, 1209, 10", "122.142.77.84, 8081, 10", "122.142.77.84, 82, 10", "60.21.206.165, 9999, 10", "203.195.232.60, 8000, 10", "125.88.74.122, 85, 10", "122.142.77.84, 80, 10", "125.88.74.122, 82, 10", "125.88.74.122, 84, 10", "125.88.74.122, 85, 10", "119.29.66.74, 8000, 10", "125.88.74.122, 84, 10", "122.142.77.84, 8081, 10", "119.237.211.19, 3128, 10", "125.88.74.122, 83, 10", "125.88.74.122, 83, 10", "61.191.41.130, 80, 10", "122.142.77.84, 82, 10", "61.191.41.130, 80, 10", "119.237.211.19, 3128, 10", "122.142.77.84, 82, 10", "125.88.74.122, 85, 10", "125.88.74.122, 82, 10", "111.155.116.249, 8123, 10", "125.88.74.122, 84, 10", "125.88.74.122, 82, 10", "125.88.74.122, 83, 10", "61.191.41.130, 80, 10", "60.168.240.180, 808, 10", "125.88.74.122, 83, 10", "122.142.77.84, 8081, 10", "113.123.79.122, 808, 10", "60.21.206.165, 9999, 10", "113.123.79.122, 808, 10", "122.142.77.84, 80, 10", "61.191.41.130, 80, 10", "61.191.41.130, 80, 10", "122.142.77.84, 8081, 10", "61.191.41.130, 80, 10", "60.21.206.165, 9999, 10", "122.142.77.84, 8081, 10", "122.142.77.84, 82, 10", "60.21.206.165, 9999, 10", "61.191.41.130, 80, 10", "61.191.41.130, 80, 10", "203.198.193.3, 808, 10", "122.142.77.84, 82, 10", "60.21.206.165, 9999, 10", "61.191.41.130, 80, 10", "61.191.41.130, 80, 10", "60.21.206.165, 9999, 10", "122.142.77.84, 82, 10", "122.142.77.84, 80, 10", "119.5.163.126, 808, 10", "61.191.41.130, 80, 10", "60.168.240.180, 808, 10", "61.191.41.130, 80, 10", "122.142.77.84, 80, 10", "58.176.46.248, 8380, 10", "58.176.46.248, 8380, 10", "116.193.153.166, 9666, 10", "61.191.41.130, 80, 10", "58.176.46.248, 8380, 10", "125.88.74.122, 83, 10", "122.142.77.84, 8081, 10", "122.142.77.84, 8081, 10", "58.176.46.248, 8380, 10", "60.21.206.165, 9999, 10", "60.21.206.165, 9999, 10", "61.191.41.130, 80, 10", "58.176.46.248, 8380, 10", "61.191.41.130, 80, 10", "118.141.160.77, 80, 10", "60.21.206.165, 9999, 10", "58.176.46.248, 8380, 10", "113.123.79.122, 808, 10", "60.249.19.50, 8080, 10", "121.193.143.249, 80, 10", "122.142.77.84, 8081, 10", "121.206.34.230, 808, 10", "115.182.16.123, 1080, 10", "58.176.46.248, 8380, 10", "122.142.77.84, 82, 10", "122.142.77.84, 82, 10", "58.176.46.248, 8380, 10", "203.198.124.153, 808, 10", "58.176.46.248, 8380, 10", "119.237.211.19, 3128, 10", "122.142.77.84, 80, 10", "58.176.46.248, 8380, 10", "122.142.77.84, 82, 10", "122.142.77.84, 80, 10", "218.191.247.51, 8380, 10", "60.21.206.165, 9999, 10", "113.252.236.96, 8080, 10", "118.193.156.198, 8998, 10", "122.142.77.84, 8081, 10", "119.14.79.27, 80, 10", "61.191.41.130, 80, 10", "218.201.98.196, 3128, 10", "58.176.46.248, 8380, 10", "218.201.98.196, 3128, 10", "218.201.98.196, 3128, 10", "58.176.46.248, 8380, 10", "118.141.160.77, 80, 10", "183.222.237.84, 8123, 10", "203.198.193.3, 808, 10", "203.195.232.60, 8000, 10", "60.173.25.245, 808, 10", "203.198.193.3, 808, 10", "203.198.193.3, 808, 10", "218.191.247.51, 8380, 10", "111.1.3.34, 8000, 10", "122.142.77.84, 82, 10", "125.88.74.122, 83, 10", "112.91.135.115, 8080, 10", "116.193.153.166, 9666, 10", "221.131.39.30, 8081, 10", "119.237.211.19, 3128, 10", "60.250.72.252, 8080, 10", "118.141.160.77, 80, 10", "113.123.112.203, 808, 10", "111.56.7.6, 8080, 10", "111.1.3.34, 8000, 10", "58.176.46.248, 8380, 10", "119.29.66.74, 8000, 10", "58.176.46.248, 8380, 10", "111.13.7.42, 80, 10", "203.198.193.3, 808, 10", "218.191.247.51, 8380, 10", "122.142.77.84, 8081, 10", "221.131.39.30, 8081, 10", "101.71.17.132, 8081, 10", "218.201.98.196, 3128, 10", "60.169.19.66, 9000, 10", "221.229.47.48, 808, 10", "218.201.98.196, 3128, 10", "112.91.135.115, 8080, 10", "60.169.19.66, 9000, 10", "58.176.46.248, 8380, 10", "111.1.3.34, 8000, 10", "223.153.207.152, 808, 10", "60.249.19.50, 8080, 10", "113.254.102.87, 80, 10", "119.29.66.74, 8000, 10", "122.142.77.84, 82, 10", "221.131.39.30, 8081, 10", "60.21.206.165, 9999, 10", "218.191.247.51, 8380, 10", "60.169.19.66, 9000, 10", "111.56.7.5, 8080, 10", "118.141.160.77, 80, 10", "118.141.160.77, 80, 10", "203.195.232.60, 8000, 10", "111.56.7.7, 8080, 10", "60.169.19.66, 9000, 10", "218.201.98.196, 3128, 10", "182.43.199.247, 808, 10", "101.71.17.132, 8081, 10", "119.14.79.27, 80, 10", "111.56.7.5, 8080, 10", "111.56.7.4, 8080, 10", "111.56.7.8, 8080, 10", "111.56.7.3, 8080, 10", "111.1.3.34, 8000, 10", "111.56.7.4, 8080, 10", "111.56.7.7, 8080, 10", "203.195.232.60, 8000, 10", "121.61.102.189, 808, 10", "60.249.19.50, 8080, 10", "218.28.243.237, 8081, 10", "122.142.77.84, 8081, 10", "111.56.7.8, 8080, 10", "111.56.7.7, 8080, 10", "122.142.77.84, 8081, 10", "113.252.236.96, 8080, 10", "203.195.232.60, 8000, 10", "111.56.7.3, 8080, 10", "111.56.7.6, 8080, 10", "111.56.7.5, 8080, 10", "113.252.129.133, 80, 10", "111.56.7.3, 8080, 10", "111.56.7.6, 8080, 10", "103.15.187.116, 3128, 10", "139.209.60.34, 8081, 10", "223.19.212.30, 8380, 10", "218.201.98.196, 3128, 10", "101.230.214.25, 8080, 10", "122.142.77.84, 82, 10", "112.91.135.115, 8080, 10", "119.29.66.74, 8000, 10", "115.210.46.76, 808, 10", "115.151.6.203, 808, 10", "60.250.72.252, 8080, 10", "111.56.7.5, 8080, 10", "218.201.98.196, 3128, 10", "122.142.77.84, 80, 10", "60.249.19.50, 8080, 10", "101.71.17.132, 8081, 10", "223.19.212.30, 8380, 10", "115.231.175.68, 8081, 10", "119.29.66.74, 8000, 10", "119.14.79.27, 80, 10", "122.142.77.84, 82, 10", "111.56.7.4, 8080, 10", "218.201.98.196, 3128, 10", "111.56.7.7, 8080, 10", "111.56.7.8, 8080, 10", "114.239.0.100, 808, 10", "111.56.7.6, 8080, 10", "112.33.7.9, 8081, 10", "60.169.19.66, 9000, 10", "218.104.148.157, 8080, 10", "60.26.192.230, 28721, 10", "111.56.7.3, 8080, 10", "101.230.214.25, 8080, 10", "111.56.7.5, 8080, 10", "112.74.114.68, 82, 10", "218.28.243.237, 8081, 10", "219.246.184.153, 80, 10", "101.71.17.132, 8081, 10", "218.201.98.196, 3128, 10", "121.61.102.189, 808, 10", "60.169.19.66, 9000, 10", "121.196.226.246, 84, 10", "111.56.7.5, 8080, 10", "218.201.98.196, 3128, 10", "111.56.7.4, 8080, 10", "111.56.7.6, 8080, 10", "111.56.7.4, 8080, 10", "175.30.124.96, 80, 10", "49.86.62.149, 808, 10", "139.209.60.34, 8081, 10", "111.56.7.4, 8080, 10", "221.238.140.210, 81, 10", "111.56.7.6, 8080, 10", "110.73.159.183, 8123, 10", "111.56.7.7, 8080, 10", "112.33.7.9, 8081, 10", "111.56.7.4, 8080, 10", "219.246.36.164, 8123, 10", "111.56.7.8, 8080, 10", "115.220.150.220, 808, 10", "175.155.24.30, 808, 10", "218.75.172.108, 8081, 10", "111.56.7.3, 8080, 10", "111.56.7.7, 8080, 10", "111.56.7.8, 8080, 10", "111.56.7.8, 8080, 10", "111.56.7.6, 8080, 10", "218.201.98.196, 3128, 10", "111.56.7.6, 8080, 10", "61.191.41.130, 80, 10", "111.56.7.7, 8080, 10", "111.56.7.7, 8080, 10", "202.69.71.210, 808, 10", "111.56.7.3, 8080, 10", "111.56.7.5, 8080, 10", "218.28.243.237, 8081, 10", "111.56.7.5, 8080, 10", "111.56.7.8, 8080, 10", "111.56.7.6, 8080, 10", "111.1.3.34, 8000, 10", "122.142.77.84, 80, 10", "60.168.240.180, 808, 10", "117.33.145.154, 8888, 10", "119.29.66.74, 8000, 10", "221.229.44.112, 808, 10", "111.56.7.5, 8080, 10", "119.5.1.53, 808, 10", "59.56.253.58, 8081, 10", "111.56.7.6, 8080, 10", "122.96.59.103, 82, 10", "111.56.7.6, 8080, 10", "113.57.97.27, 808, 10", "101.71.17.132, 8081, 10", "111.56.7.4, 8080, 10", "58.176.46.248, 80, 10", "123.149.254.6, 8081, 10", "111.1.3.34, 8000, 10", "218.75.172.108, 8081, 10", "111.56.7.3, 8080, 10", "111.56.7.4, 8080, 10", "111.56.7.3, 8080, 10", "118.141.160.77, 80, 10", "218.201.98.196, 3128, 10", "219.246.184.153, 80, 10", "111.56.7.6, 8080, 10", "175.155.24.40, 808, 10", "111.56.7.3, 8080, 10", "112.74.114.68, 82, 10", "175.42.68.110, 808, 10", "1.49.185.201, 18720, 10", "211.23.136.230, 3128, 10", "60.249.19.50, 8080, 10", "115.231.175.68, 8081, 10", "139.209.60.34, 8081, 10", "221.212.252.230, 1920, 10", "58.52.201.119, 8080, 10", "139.209.60.34, 8081, 10", "219.246.184.153, 80, 10", "119.5.1.78, 808, 10", "111.56.7.3, 8080, 10", "111.56.7.8, 8080, 10", "175.155.247.89, 808, 10", "218.201.98.196, 3128, 10", "219.246.184.153, 80, 10", "111.56.7.6, 8080, 10", "111.56.7.7, 8080, 10", "59.56.253.58, 8081, 10", "119.5.1.42, 808, 10", "119.5.1.17, 808, 10", "111.56.7.7, 8080, 10", "139.209.60.34, 8081, 10", "60.249.19.50, 8080, 10", "112.91.135.115, 8080, 10", "223.19.212.30, 8380, 10", "111.56.7.5, 8080, 10", "111.56.7.6, 8080, 10", "60.205.203.215, 1080, 10", "111.56.7.5, 8080, 10", "119.5.1.52, 808, 10", "113.121.245.193, 808, 10", "111.56.7.5, 8080, 10", "111.56.7.8, 8080, 10", "123.169.87.15, 808, 10", "36.249.31.233, 808, 10", "111.56.7.4, 8080, 10", "111.56.7.3, 8080, 10", "115.220.2.51, 808, 10", "114.239.0.75, 808, 10", "58.176.46.248, 8380, 10", "111.56.7.7, 8080, 10", "111.56.7.8, 8080, 10", "58.52.201.119, 8080, 10", "101.71.17.132, 8081, 10", "111.56.7.7, 8080, 10", "121.196.226.246, 84, 10", "111.56.7.7, 8080, 10", "115.231.175.68, 8081, 10", "219.246.184.153, 80, 10", "218.28.243.237, 8081, 10", "119.14.79.27, 80, 10", "111.56.7.8, 8080, 10", "111.56.7.4, 8080, 10", "111.56.7.5, 8080, 10", "111.56.7.4, 8080, 10", "175.155.24.53, 808, 10", "111.56.7.5, 8080, 10", "111.56.7.8, 8080, 10", "61.135.217.3, 80, 10", "175.155.24.36, 808, 10", "218.201.98.196, 3128, 10", "36.249.30.30, 808, 10", "123.149.254.6, 8081, 10", "119.14.79.27, 80, 10", "111.56.7.4, 8080, 10", "121.232.144.67, 9000, 10", "60.21.206.165, 9999, 10", "119.178.184.157, 41117, 10", "61.166.151.82, 8080, 10", "111.56.7.7, 8080, 10", "60.13.74.183, 843, 10", "111.56.7.6, 8080, 10", "139.209.60.34, 8081, 10", "60.250.72.252, 8080, 10", "122.142.77.84, 80, 10", "111.56.7.6, 8080, 10", "124.65.158.26, 8118, 10", "223.246.41.61, 37644, 10", "111.56.7.3, 8080, 10", "111.56.7.8, 8080, 10", "111.56.7.6, 8080, 10", "60.249.19.50, 8080, 10", "60.21.206.165, 9999, 10", "180.201.181.58, 8998, 10", "111.56.7.4, 8080, 10", "139.209.60.34, 8081, 10", "222.51.36.7, 8998, 10", "203.195.232.60, 8000, 10", "59.56.253.58, 8081, 10", "124.88.67.82, 843, 10", "175.155.25.19, 808, 10", "111.56.7.8, 8080, 10", "124.88.67.81, 80, 10", "175.42.68.110, 808, 10", "101.71.17.132, 8081, 10", "175.30.124.96, 80, 10", "203.195.232.60, 8000, 10", "111.56.7.7, 8080, 10", "222.85.50.110, 808, 10", "171.13.37.18, 808, 10", "111.56.7.5, 8080, 10", "119.6.87.191, 8081, 10", "111.56.7.7, 8080, 10", "124.88.67.82, 843, 10", "175.43.106.157, 808, 10", "111.56.7.3, 8080, 10", "111.56.7.8, 8080, 10", "211.23.136.230, 3128, 10", "59.56.253.58, 8081, 10", "111.56.7.6, 8080, 10", "123.169.90.217, 808, 10", "121.193.143.249, 80, 10", "111.56.7.4, 8080, 10", "119.54.50.55, 8998, 10", "58.19.228.190, 8998, 10", "111.56.7.5, 8080, 10", "175.155.24.60, 808, 10", "219.246.184.153, 80, 10", "175.155.24.62, 808, 10", "111.56.7.7, 8080, 10", "111.56.7.5, 8080, 10", "113.123.79.122, 808, 10", "222.85.50.83, 808, 10", "124.88.67.81, 80, 10", "115.220.3.164, 808, 10", "111.56.7.8, 8080, 10", "111.56.7.5, 8080, 10", "114.239.2.11, 808, 10", "60.169.19.66, 9000, 10", "219.246.184.153, 80, 10", "111.56.7.4, 8080, 10", "111.1.3.34, 8000, 10", "124.88.67.82, 80, 10", "124.88.67.81, 80, 10", "101.71.17.132, 8081, 10", "125.208.14.70, 8090, 10", "123.149.254.6, 8081, 10", "222.51.36.7, 8998, 10", "60.169.19.66, 9000, 10", "218.241.153.211, 81, 10", "112.74.114.68, 82, 10", "111.56.7.6, 8080, 10", "111.56.7.4, 8080, 10", "111.56.7.5, 8080, 10", "111.56.7.3, 8080, 10", "111.56.7.8, 8080, 10", "139.209.60.34, 8081, 10", "218.201.98.196, 3128, 10", "111.56.7.4, 8080, 10", "175.155.24.51, 808, 10", "115.231.175.68, 8081, 10", "111.56.7.6, 8080, 10", "111.56.7.7, 8080, 10", "111.56.7.4, 8080, 10", "171.13.37.13, 808, 10", "219.246.184.153, 80, 10", "60.249.19.50, 8080, 10", "119.5.1.44, 808, 10", "111.155.116.200, 8123, 10", "113.252.129.133, 80, 10", "124.88.67.82, 843, 10", "101.87.76.164, 44078, 10", "183.161.217.240, 50291, 10", "111.56.7.3, 8080, 10", "111.56.7.4, 8080, 10", "115.231.175.68, 8081, 10", "101.224.209.30, 14618, 10", "175.42.68.110, 808, 10", "218.28.243.237, 8081, 10", "115.220.6.178, 808, 10", "218.201.98.196, 3128, 10", "111.56.7.3, 8080, 10", "111.56.7.7, 8080, 10", "124.88.67.81, 80, 10", "120.204.85.29, 3128, 10", "222.85.50.159, 808, 10", "111.56.7.6, 8080, 10", "219.246.184.153, 80, 10", "221.229.46.41, 808, 10", "219.246.184.153, 80, 10", "117.33.145.154, 8888, 10", "115.220.145.18, 808, 10", "36.249.30.183, 808, 10", "111.56.7.6, 8080, 10", "60.249.19.50, 8080, 10", "218.75.172.108, 8081, 10", "101.71.17.132, 8081, 10", "119.14.79.27, 80, 10", "219.246.184.153, 80, 10", "182.89.193.244, 8998, 10", "211.141.131.12, 63000, 10", "60.249.19.50, 8080, 10", "222.51.36.7, 8998, 10", "111.56.7.5, 8080, 10", "139.209.60.34, 8081, 10", "60.169.19.66, 9000, 10", "111.56.7.7, 8080, 10", "111.56.7.3, 8080, 10", "111.56.7.8, 8080, 10", "119.5.0.60, 808, 10", "111.56.7.8, 8080, 10", "111.56.7.3, 8080, 10", "183.185.60.69, 8998, 10", "101.71.17.132, 8081, 10", "219.246.184.153, 80, 10", "120.27.49.85, 8090, 10", "120.76.97.17, 9797, 10", "115.154.35.151, 80, 10", "119.5.1.30, 808, 10", "121.196.226.246, 84, 10", "111.56.7.3, 8080, 10", "36.249.26.153, 808, 10", "123.149.254.6, 8081, 10", "139.209.60.34, 8081, 10", "111.56.7.3, 8080, 10", "175.43.106.43, 808, 10", "175.155.24.30, 808, 10", "219.246.184.153, 80, 10", "175.30.124.96, 80, 10", "59.56.253.58, 8081, 10", "123.149.254.6, 8081, 10", "119.5.1.13, 808, 10", "219.246.184.153, 80, 10", "175.155.25.32, 808, 10", "111.56.7.4, 8080, 10", "111.56.7.8, 8080, 10", "119.5.0.57, 808, 10", "123.149.254.6, 8081, 10", "101.71.17.132, 8081, 10", "218.21.91.214, 8081, 10", "111.56.7.5, 8080, 10", "117.33.145.154, 8888, 10", "218.28.243.237, 8081, 10", "111.1.3.34, 8000, 10", "222.169.193.162, 8099, 10", "182.43.198.60, 808, 10", "124.88.67.82, 80, 10", "111.56.7.7, 8080, 10", "59.61.92.205, 8118, 10", "111.56.7.5, 8080, 10", "111.120.84.185, 8081, 10", "124.88.67.81, 80, 10", "221.229.46.4, 808, 10", "111.56.7.4, 8080, 10", "111.56.7.6, 8080, 10", "111.56.7.7, 8080, 10", "123.149.254.6, 8081, 10", "123.179.130.110, 8080, 10", "113.227.168.145, 31530, 10", "60.169.19.66, 9000, 10", "49.87.155.250, 48030, 10", "219.216.121.83, 8998, 10", "59.56.253.58, 8081, 10", "111.56.7.7, 8080, 10", "125.88.74.122, 83, 10", "111.56.7.6, 8080, 10", "122.114.175.92, 8081, 10", "175.43.106.16, 808, 10", "111.1.3.34, 8000, 10", "119.5.0.55, 808, 10", "223.153.207.152, 808, 10", "124.88.67.82, 82, 10", "59.56.253.58, 8081, 10", "111.56.7.5, 8080, 10", "111.56.7.8, 8080, 10", "125.88.74.122, 84, 10", "125.88.74.122, 82, 10", "175.30.124.96, 80, 10", "119.14.79.27, 80, 10", "119.6.87.191, 8081, 10", "119.5.1.10, 808, 10", "175.155.24.53, 808, 10", "171.13.36.202, 808, 10", "112.91.135.115, 8080, 10", "180.76.154.5, 8888, 10", "175.155.24.23, 808, 10", "175.155.24.45, 808, 10", "119.5.1.52, 808, 10", "117.33.145.154, 8888, 10", "117.43.1.117, 808, 10", "125.88.74.122, 85, 10", "175.43.106.43, 808, 10", "111.56.7.3, 8080, 10", "59.56.253.58, 8081, 10", "122.5.128.142, 808, 10", "222.85.39.36, 808, 10", "115.215.69.119, 808, 10", "175.155.25.46, 808, 10", "60.169.19.66, 9000, 10", "203.195.232.60, 8000, 10", "59.56.253.58, 8081, 10", "111.56.7.7, 8080, 10", "175.155.24.60, 808, 10", "60.169.19.66, 9000, 10", "119.5.1.18, 808, 10", "171.13.37.45, 808, 10", "203.198.193.3, 808, 10", "114.239.149.235, 808, 10", "121.232.144.165, 9000, 10", "222.169.193.162, 8099, 10", "113.58.235.163, 808, 10", "119.5.0.34, 808, 10", "180.97.235.30, 80, 10", "175.155.25.5, 808, 10", "60.13.74.183, 80, 10", "123.149.254.6, 8081, 10", "117.33.145.154, 8888, 10", "114.99.14.163, 808, 10", "219.216.79.125, 8998, 10", "113.123.112.203, 808, 10", "119.6.87.191, 8081, 10", "120.27.113.72, 8888, 10", "125.88.74.122, 84, 10", "125.88.74.122, 85, 10", "117.139.181.81, 41049, 10", "119.5.0.36, 808, 10", "111.56.7.5, 8080, 10", "121.196.226.246, 84, 10", "49.87.155.250, 48030, 10", "112.193.91.96, 80, 10", "101.71.240.39, 8998, 10", "203.198.193.3, 808, 10", "218.75.172.108, 8081, 10", "175.155.25.40, 808, 10", "222.85.50.136, 808, 10", "218.91.156.188, 808, 10", "222.85.50.224, 808, 10", "111.120.84.185, 8081, 10", "113.4.136.206, 8998, 10", "113.58.232.235, 808, 10", "59.56.253.58, 8081, 10", "60.183.176.216, 29215, 10", "110.183.164.131, 39369, 10", "171.38.185.5, 8123, 10", "60.250.72.252, 8080, 10", "222.169.193.162, 8099, 10", "220.179.219.26, 808, 10", "59.56.253.58, 8081, 10", "118.76.235.44, 8998, 10", "175.30.124.96, 80, 10", "171.38.161.13, 8123, 10", "115.231.175.68, 8081, 10", "175.155.24.23, 808, 10", "123.163.154.84, 808, 10", "122.5.135.95, 808, 10", "119.237.211.19, 3128, 10", "222.186.45.117, 55336, 10", "175.155.24.25, 808, 10", "112.74.114.68, 82, 10", "125.75.225.165, 8998, 10", "59.56.253.58, 8081, 10", "116.238.167.25, 14192, 10", "120.76.97.17, 9797, 10", "27.193.167.211, 8118, 10", "119.5.0.23, 808, 10", "171.13.37.56, 808, 10", "121.226.152.248, 808, 10", "60.249.19.50, 8080, 10", "121.61.98.154, 808, 10", "106.32.66.161, 21281, 10", "175.155.24.23, 808, 10", "123.149.254.6, 8081, 10", "60.178.84.202, 808, 10", "175.155.25.54, 808, 10", "119.5.0.55, 808, 10", "120.24.159.149, 80, 10", "113.122.135.249, 808, 10", "121.40.35.212, 8123, 10", "218.21.91.214, 8081, 10", "116.207.82.83, 47846, 10", "112.91.135.115, 8080, 10", "59.49.206.10, 34354, 10", "119.14.79.27, 80, 10", "27.8.189.200, 8888, 10", "175.155.24.26, 808, 10", "119.5.1.6, 808, 10", "119.5.1.44, 808, 10", "121.62.134.111, 808, 10", "120.76.97.17, 9797, 10", "117.139.181.81, 41049, 10", "60.169.19.66, 9000, 10", "124.88.67.82, 82, 10", "115.46.214.122, 24963, 10", "202.114.138.149, 8998, 10", "124.88.67.81, 80, 10", "111.56.7.8, 8080, 10", "119.5.0.36, 808, 10", "125.92.32.212, 808, 10", "124.88.67.82, 80, 10", "119.5.1.23, 808, 10", "123.149.254.6, 8081, 10", "123.149.254.6, 8081, 10", "61.93.84.86, 3128, 10", "113.69.167.94, 808, 10", "221.131.39.30, 8081, 10", "117.139.181.81, 41049, 10", "60.27.238.18, 11935, 10", "60.249.19.50, 8080, 10", "182.89.193.244, 8998, 10", "111.155.124.91, 8123, 10", "211.20.129.133, 8080, 10", "27.157.167.172, 8998, 10", "59.61.92.205, 8118, 10", "139.209.60.34, 8081, 10", "219.216.122.171, 8998, 10", "183.153.23.35, 808, 10", "114.139.151.18, 33688, 10", "221.229.46.119, 808, 10", "119.5.1.17, 808, 10", "113.58.233.41, 808, 10", "59.56.253.58, 8081, 10", "175.155.24.49, 808, 10", "59.127.38.117, 8080, 10", "139.209.60.34, 8081, 10", "113.58.235.64, 808, 10", "111.1.3.34, 8000, 10", "119.5.0.40, 808, 10", "36.249.30.26, 808, 10", "175.155.25.2, 808, 10", "175.21.117.51, 8998, 10", "123.173.34.217, 8998, 10", "60.249.19.50, 8080, 10", "60.25.134.189, 40351, 10", "180.158.137.151, 20900, 10", "49.86.62.24, 808, 10", "119.5.0.36, 808, 10", "59.61.92.205, 8118, 10", "59.127.38.117, 8080, 10", "125.208.14.70, 8090, 10", "221.221.39.34, 46393, 10", "113.58.232.31, 808, 10", "183.95.80.165, 8080, 10", "113.58.232.91, 808, 10", "111.155.124.70, 8123, 10", "113.121.240.249, 808, 10", "113.69.166.80, 808, 10", "218.21.91.214, 8081, 10", "113.58.232.119, 808, 10", "175.155.25.27, 808, 10", "125.34.77.124, 42257, 10", "58.243.104.149, 8998, 10", "27.8.189.200, 8888, 10", "124.133.230.254, 80, 10", "1.199.194.91, 808, 10", "180.169.59.222, 8080, 10", "61.188.24.148, 808, 10", "114.99.4.28, 808, 10", "203.195.232.60, 8000, 10", "125.89.120.129, 808, 10", "222.186.45.117, 55336, 10", "14.134.231.148, 10562, 10", "14.109.124.133, 8998, 10", "124.88.67.82, 82, 10", "175.155.25.49, 808, 10", "222.94.148.45, 808, 10", "218.21.91.214, 8081, 10", "36.249.24.198, 808, 10", "218.63.208.223, 3128, 10", "175.155.24.26, 808, 10", "121.196.226.246, 84, 10", "123.169.89.108, 808, 10", "222.85.50.211, 808, 10", "124.88.67.82, 843, 10", "183.152.169.206, 3128, 10", "121.30.228.182, 8998, 10", "124.88.67.82, 80, 10", "110.189.223.93, 808, 10", "111.155.124.70, 8123, 10", "113.121.255.252, 808, 10", "119.5.0.126, 808, 10", "113.58.232.140, 808, 10", "112.91.135.115, 8080, 10", "58.42.81.88, 27916, 10", "113.58.234.109, 808, 10", "14.109.149.91, 36041, 10", "218.22.219.133, 808, 10", "122.114.175.92, 8081, 10", "183.130.11.2, 8998, 10", "120.37.204.138, 8998, 10", "121.22.69.214, 8998, 10", "175.155.24.23, 808, 10", "119.5.1.31, 808, 10", "121.60.86.54, 8888, 10", "120.52.21.132, 8082, 10", "175.155.25.27, 808, 10", "111.120.84.185, 8081, 10", "123.162.231.175, 32689, 10", "36.249.30.26, 808, 10", "123.169.90.98, 808, 10", "119.5.0.82, 808, 10", "175.155.25.49, 808, 10", "119.5.0.60, 808, 10", "119.0.121.205, 8998, 10", "115.216.31.87, 8118, 10", "218.21.91.214, 8081, 10", "111.13.7.116, 8080, 10", "119.4.156.49, 8998, 10", "59.56.253.58, 8081, 10", "125.208.14.70, 8090, 10", "219.246.184.153, 80, 10", "58.221.38.170, 8080, 10", "58.221.38.170, 8080, 10", "117.90.6.146, 9000, 10", "118.88.39.168, 8998, 10", "121.60.86.54, 8888, 10", "36.7.40.106, 33386, 10", "119.142.164.233, 31977, 10", "120.43.48.42, 808, 10", "36.249.24.172, 808, 10", "219.246.184.153, 80, 10", "113.58.235.197, 808, 10", "222.128.80.28, 8081, 10", "175.155.25.32, 808, 10", "60.5.153.83, 8998, 10", "202.201.7.77, 8998, 10", "120.24.159.149, 80, 10", "123.206.93.108, 8081, 10", "120.52.21.132, 8082, 10", "120.52.21.132, 8082, 10", "221.6.201.18, 9999, 10", "120.52.21.132, 8082, 10", "175.155.25.2, 808, 10", "113.58.232.49, 808, 10", "121.196.226.246, 84, 10", "123.173.34.217, 8998, 10", "211.159.220.48, 808, 10", "113.4.136.206, 8998, 10", "210.77.69.128, 8998, 10", "117.43.0.255, 808, 10", "58.221.38.170, 8080, 10", "203.195.232.60, 8000, 10", "120.52.21.132, 8082, 10", "115.220.1.135, 808, 10", "203.198.193.3, 808, 10", "175.155.25.40, 808, 10", "113.58.234.252, 808, 10", "58.19.228.190, 8998, 10", "175.43.106.157, 808, 10", "113.58.235.226, 808, 10", "36.249.25.145, 808, 10", "175.42.68.110, 808, 10", "183.185.60.69, 8998, 10", "183.95.80.165, 8080, 10", "113.58.234.183, 808, 10", "111.1.3.34, 8000, 10", "60.13.74.183, 843, 10", "125.208.14.70, 8090, 10", "175.155.25.43, 808, 10", "119.29.66.74, 8000, 10", "120.52.21.132, 8082, 10", "1.49.185.201, 18720, 10", "180.170.102.218, 8118, 10", "139.196.233.234, 8888, 10", "27.211.73.165, 8998, 10", "113.58.234.44, 808, 10", "175.155.25.6, 808, 10", "117.21.234.96, 8080, 10", "171.8.79.143, 8080, 10", "58.221.38.170, 8080, 10", "202.113.91.108, 8998, 10", "124.88.67.82, 80, 10", "124.88.67.81, 80, 10", "60.250.72.252, 8080, 10", "203.195.232.60, 8000, 10", "121.232.145.162, 9000, 10", "175.30.124.96, 80, 10", "59.62.165.34, 808, 10", "36.249.30.117, 808, 10", "113.255.49.49, 80, 10", "27.13.161.10, 14281, 10", "101.53.101.172, 9999, 10", "125.88.74.122, 83, 10", "60.21.132.218, 63000, 10", "113.58.235.15, 808, 10", "183.224.99.149, 8123, 10", "175.155.25.22, 808, 10", "120.52.21.132, 8082, 10", "175.155.24.114, 808, 10", "61.178.221.174, 8998, 10", "125.75.225.165, 8998, 10", "120.76.97.17, 9797, 10", "175.155.25.20, 808, 10", "60.183.218.116, 808, 10", "112.91.135.115, 8080, 10", "171.8.79.143, 8080, 10", "175.155.25.40, 808, 10", "101.200.72.123, 8118, 10", "117.90.3.85, 9000, 10", "111.1.3.34, 8000, 10", "218.8.196.235, 8998, 10", "121.30.228.182, 8998, 10", "218.64.93.165, 808, 10", "121.193.143.249, 80, 10", "113.58.232.47, 808, 10", "218.22.219.133, 808, 10", "58.221.38.170, 8080, 10", "117.21.234.96, 8080, 10", "111.155.124.67, 8123, 10", "119.5.0.95, 808, 10", "113.123.142.66, 35183, 10", "117.43.0.240, 808, 10", "117.21.234.96, 8080, 10", "218.21.91.214, 8081, 10", "122.5.134.150, 808, 10", "221.229.46.73, 808, 10", "124.88.67.82, 82, 10", "119.39.112.66, 8081, 10", "183.222.237.84, 8123, 10", "183.95.80.165, 8080, 10", "124.65.158.26, 8118, 10", "42.122.235.224, 45275, 10", "114.139.128.155, 33573, 10", "101.71.17.132, 8081, 10", "171.8.79.143, 8080, 10", "113.252.129.133, 8383, 10", "202.69.71.210, 808, 10", "120.52.21.132, 8082, 10", "183.152.169.206, 3128, 10", "60.249.19.50, 8080, 10", "121.60.86.54, 8888, 10", "124.31.104.108, 8998, 10", "222.128.80.28, 8081, 10", "221.6.201.18, 9999, 10", "171.38.65.181, 8123, 10", "58.221.38.170, 8080, 10", "125.88.74.122, 83, 10", "120.40.25.159, 53396, 10", "222.85.50.101, 808, 10", "113.57.97.174, 808, 10", "222.33.192.238, 8118, 10", "222.128.80.28, 8081, 10", "120.52.21.132, 8082, 10", "121.60.86.54, 8888, 10", "218.75.172.108, 8081, 10", "117.21.234.96, 8080, 10", "121.232.148.34, 9000, 10", "113.58.235.140, 808, 10", "14.105.34.8, 14471, 10"
            "113.53.51.103:8080",
            "120.132.26.41:8080",
            "120.132.71.212:80",
            "41.65.31.115:3128",
            "220.249.185.178:9999",
            "103.240.100.106:8080",
            "36.67.64.9:8080",
            "163.172.29.111:3128",
            "132.148.76.101:8080",
            "168.232.165.233:3128",
            "112.91.208.78:9999",
            "119.4.194.255:8998",
            "31.145.83.206:9090",
            "89.40.114.206:8080",
            "171.38.177.126:8123",
            "95.170.219.13:8080",
            "78.187.113.241:9090",
            "171.39.224.199:8123",
            "112.81.67.72:38715",
            "113.121.247.8:808",
            "157.119.200.17:8080",
            "212.237.23.220:8080",
            "138.201.63.123:31288",
            "110.136.206.221:80",
            "103.5.63.10:80",
            "104.131.117.7:443",
            "42.58.177.17:8998",
            "74.121.190.104:8080",
            "138.197.32.85:3128",
            "5.135.195.166:3128",
            "212.237.17.92:80",
            "112.251.13.216:35637",
            "203.91.121.74:3128",
            "59.149.193.77:3128",
            "120.132.26.38:8080",
            "185.168.173.26:8080",
            "111.13.7.123:80",
            "191.34.75.232:3128",
            "171.38.199.183:8123",
            "101.251.199.66:3128",
            "109.188.81.101:8080",
            "192.129.219.28:9001",
            "104.237.246.26:3128",
            "194.143.137.129:53281",
            "85.132.5.69:8080",
            "186.101.121.186:8080",
            "122.228.179.178:80",
            "120.132.3.26:8080",
            "118.193.23.162:3128",
            "113.200.159.155:9999",
            "202.121.183.240:3128",
            "91.228.54.38:8080",
            "111.13.7.120:80",
            "189.1.165.98:3128",
            "1.82.216.135:80",
            "206.251.227.56:80",
            "58.23.16.240:80",
            "177.54.152.140:3128",
            "94.177.233.75:8080",
            "176.126.245.23:3128",
            "95.0.178.3:8080",
            "120.132.26.2:8080",
            "175.155.25.2:808",
            "222.66.22.82:8090",
            "149.56.126.215:8799",
            "61.152.81.193:9100",
            "43.224.117.202:8080",
            "190.7.59.147:3128",
            "118.171.185.83:3128"
    };
}
