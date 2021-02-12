# userauth/views.py

import json
                             
from django.http import JsonResponse, HttpResponse
from django.views.decorators.csrf import csrf_exempt
from django.contrib.auth import login, logout
from django.contrib.auth import authenticate
from studies.models import Study
                             
from rest_framework import status
                             
from . import serializers
from . import models
                             
                             
@csrf_exempt
def auth_login(request):
    """Client attempts to login
                             
     - Check for username and password
     - Return serialized user data
    """
    print(request.POST)
    x = json.loads(request.body)
    print(x)
    username = x['username']
    password = x['password']
    user = authenticate(username=username, password=password)
                             
    if user:
        login(request,user)
        #serializer = serializers.UserSerializer(user)
        studies = request.user.study_set.all() #gets only the studies the user has accessed to:
        #print all studies this user can see
        
        s = {
            "id" : str(user.hash_id),
            "type" : str(user.user_type)
        }
        # for study in studies:
        #     #s = {"studyName" : "' + str(study.name) + '", "patientName" : "' + str(study.patient) + '", "studyID" : " + str(study._id) + " }
        #     s.append({
        #         "studyName" : str(study.name),
        #         "patientName" : str(study.patient),
        #         "studyID" : str(study.id),
        #         "studyStatus": str(study.status)
        #         })
                  
        return JsonResponse(s,safe=False)
    return HttpResponse(status=401)

def auth_logout(request):
    """Clears the session """
    logout(request)
    return HttpResponse(status=200)